package com.edu.gmall.pms;

import com.edu.gmall.pms.entity.Product;
import com.edu.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    ProductService productService;
    @Test
    void contextLoads() {
        Product product = productService.getById(1);
        System.out.println(product.getBrandName());
    }

}
