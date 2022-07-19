package com.xyc.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyc.common.utils.PageUtils;
import com.xyc.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author xyc
 * @email ww15934351000@163.com
 * @date 2022-07-19 09:36:55
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

