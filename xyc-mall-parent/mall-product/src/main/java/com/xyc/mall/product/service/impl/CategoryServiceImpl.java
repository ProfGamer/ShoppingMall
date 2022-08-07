package com.xyc.mall.product.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyc.common.utils.PageUtils;
import com.xyc.common.utils.Query;

import com.xyc.mall.product.dao.CategoryDao;
import com.xyc.mall.product.entity.CategoryEntity;
import com.xyc.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 查询所有的类别数据，然后将数据封装为树形结构，便于前端使用
     *
     * @param params
     * @return 所有的一级类目List -> children已经全部都赋值好了
     */
    @Override
    public List<CategoryEntity> queryWithTree(Map<String, Object> params) {
        List<CategoryEntity> allCategory = baseMapper.selectList(null);
        List<CategoryEntity> categoryTree = allCategory
                .stream()
                .filter(c -> c.getParentCid() == 0)
                .map(c -> {
                    c.setSubCategory(getCategoryChildren(c, allCategory));
                    return c;
                })
                .collect(Collectors.toList());
        return categoryTree;
    }

    /**
     * 递归实现为parent赋值所有children
     *
     * @param parent
     * @param allCategory
     * @return
     */
    private List<CategoryEntity> getCategoryChildren(CategoryEntity parent, List<CategoryEntity> allCategory) {
        List<CategoryEntity> collect = allCategory
                .stream()
                .filter(c -> c.getParentCid().equals(parent.getCatId()))
                .map(c -> {
                    c.setSubCategory(getCategoryChildren(c, allCategory));
                    return c;
                })
                .collect(Collectors.toList());
        return collect;
    }

}