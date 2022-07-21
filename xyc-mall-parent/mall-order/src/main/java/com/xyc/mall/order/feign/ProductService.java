package com.xyc.mall.order.feign;

import com.xyc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Xin Yuchen
 * @Date: 2022/7/21 - 07 - 21 - 19:23
 * @Description: Any Ques or Concerns, plz contact e0838400@u.nus.edu
 * @FeignClient 指名要从注册中心中发现的服务的名称
 */
@FeignClient(name = "mall-product")
public interface ProductService {
    /**
     * @desc 需要访问的远程方法
     * @return 所有的product brand
     */
    @GetMapping("/product/brand/all")
    R queryAllBrand();
}
