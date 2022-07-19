package com.xyc.mall.product;

import com.xyc.mall.product.entity.BrandEntity;
import com.xyc.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;


    @Test
    void contextLoads() {
        BrandEntity entity = BrandEntity.builder().name("华为").descript("中华有为").build();
        brandService.save(entity);
    }

}
