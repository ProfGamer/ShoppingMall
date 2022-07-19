package com.xyc.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 开放注册中心
 * 指定Mapper接口对应的路径
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.xyc.mall.product.dao")
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
