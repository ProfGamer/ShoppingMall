package com.xyc.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 属性&属性分组关联
 * 
 * @author xyc
 * @email ww15934351000@163.com
 * @date 2022-07-19 09:36:55
 */
@Data
@TableName("pms_attr_attrgroup_relation")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttrAttrgroupRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 属性id
	 */
	private Long attrId;
	/**
	 * 属性分组id
	 */
	private Long attrGroupId;
	/**
	 * 属性组内排序
	 */
	private Integer attrSort;

}
