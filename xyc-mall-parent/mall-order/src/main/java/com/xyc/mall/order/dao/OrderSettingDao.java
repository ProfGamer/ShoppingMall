package com.xyc.mall.order.dao;

import com.xyc.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author xyc
 * @email ww15934351000@163.com
 * @date 2022-07-19 15:21:40
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
