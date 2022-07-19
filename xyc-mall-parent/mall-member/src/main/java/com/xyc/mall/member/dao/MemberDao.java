package com.xyc.mall.member.dao;

import com.xyc.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xyc
 * @email ww15934351000@163.com
 * @date 2022-07-19 15:25:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
