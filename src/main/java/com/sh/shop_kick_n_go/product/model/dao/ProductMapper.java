package com.sh.shop_kick_n_go.product.model.dao;

import com.sh.shop_kick_n_go.product.model.dto.ProductDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductDto> findAll();

    int insertProduct();
}
