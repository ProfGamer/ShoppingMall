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
 * sku图片
 * 
 * @author xyc
 * @email ww15934351000@163.com
 * @date 2022-07-19 09:36:55
 */
@Data
@TableName("pms_sku_images")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SkuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 图片地址
	 */
	private String imgUrl;
	/**
	 * 排序
	 */
	private Integer imgSort;
	/**
	 * 默认图[0 - 不是默认图，1 - 是默认图]
	 */
	private Integer defaultImg;

}
