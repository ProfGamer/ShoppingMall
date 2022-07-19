package com.xyc.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyc.common.utils.PageUtils;
import com.xyc.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author xyc
 * @email ww15934351000@163.com
 * @date 2022-07-19 15:24:54
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

