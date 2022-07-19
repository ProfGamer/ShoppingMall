package com.xyc.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyc.common.utils.PageUtils;
import com.xyc.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author xyc
 * @email ww15934351000@163.com
 * @date 2022-07-19 15:28:45
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

