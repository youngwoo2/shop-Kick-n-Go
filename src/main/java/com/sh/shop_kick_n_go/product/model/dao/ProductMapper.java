package com.sh.shop_kick_n_go.product.model.dao;

import com.sh.shop_kick_n_go.product.model.dto.ProductDto;
import com.sh.shop_kick_n_go.product.model.dto.ProductRegistDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    // 상품조회
    List<ProductDto> findAll();
    // 상품등록
    int insertProduct(ProductDto productDto);
    // 상품수정
    int updateProduct(ProductDto productDto);
    // 상품삭제
    List<ProductDto> deleteChecked();
}
