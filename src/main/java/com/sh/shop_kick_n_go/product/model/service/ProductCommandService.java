package com.sh.shop_kick_n_go.product.model.service;

import com.sh.shop_kick_n_go.product.model.dao.ProductMapper;
import com.sh.shop_kick_n_go.product.model.dto.ProductDto;
import com.sh.shop_kick_n_go.product.model.dto.ProductRegistDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class ProductCommandService {
    private final ProductMapper productMapper;

    public int insertProduct(ProductDto productDto) {
        return productMapper.insertProduct(productDto);
    }

    public int updateProduct(ProductDto productDto) {
        return productMapper.updateProduct(productDto);
    }
}