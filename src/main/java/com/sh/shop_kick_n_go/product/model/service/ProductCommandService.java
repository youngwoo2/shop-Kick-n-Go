package com.sh.shop_kick_n_go.product.model.service;

import com.sh.shop_kick_n_go.product.model.dao.ProductMapper;
import com.sh.shop_kick_n_go.product.model.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class ProductCommandService {
    private final ProductMapper productMapper;

    public int insertProduct(ProductDto productDto) {
        return productMapper.insertProduct();
    }

    public int updateProduct(ProductDto productDto) {
        return productMapper.updateProduct();
    }
}