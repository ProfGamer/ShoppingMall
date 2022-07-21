package com.xyc.mall.order.controller;

import java.util.Arrays;
import java.util.Map;


import com.xyc.mall.order.feign.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.xyc.mall.order.entity.OrderEntity;
import com.xyc.mall.order.service.OrderService;
import com.xyc.common.utils.PageUtils;
import com.xyc.common.utils.R;


/**
 * 订单
 *
 * @author xyc
 * @email ww15934351000@163.com
 * @date 2022-07-19 15:21:40
 * @RefreshScope nacos配置中心注解需要加在需要导入配置的Controller中
 */
@RestController
@RefreshScope
@RequestMapping("order/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;
    /**
     * 从配置中心导入userName & age
     */
    @Value("${user.userName}")
    private String userName;

    @Value("${user.age}")
    private Integer age;

    @GetMapping("/all-brand")
    public R getAllProductBrand() {
        return R.ok().put("product", productService.queryAllBrand());
    }

    @GetMapping("/user")
    public R getUserFromConfig() {
        return R.ok().put("userName", userName).put("age", age);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")

    public R info(@PathVariable("id") Long id) {
        OrderEntity order = orderService.getById(id);

        return R.ok().put("order", order);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")

    public R save(@RequestBody OrderEntity order) {
        orderService.save(order);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")

    public R update(@RequestBody OrderEntity order) {
        orderService.updateById(order);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")

    public R delete(@RequestBody Long[] ids) {
        orderService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
