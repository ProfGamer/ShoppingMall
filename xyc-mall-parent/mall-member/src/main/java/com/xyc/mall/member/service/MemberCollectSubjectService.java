package com.xyc.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyc.common.utils.PageUtils;
import com.xyc.mall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xyc
 * @email ww15934351000@163.com
 * @date 2022-07-19 15:25:31
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

