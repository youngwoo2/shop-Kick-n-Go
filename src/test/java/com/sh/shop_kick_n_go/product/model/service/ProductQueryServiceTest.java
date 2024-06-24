package com.sh.shop_kick_n_go.product.model.service;

import com.sh.shop_kick_n_go.product.model.dto.ProductDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductQueryServiceTest {
    @Autowired
    ProductQueryService productQueryService;

    @Test
    @DisplayName("메뉴 전체 조회")
    void test1(){
        List<ProductDto> products = productQueryService.findAll();
        assertThat(products).isNotNull().isNotEmpty().allMatch((product) -> product != null);
    }
}