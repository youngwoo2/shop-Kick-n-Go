package com.sh.shop_kick_n_go.product_qna_inquiry.model.service;

import com.sh.shop_kick_n_go.product_qna_inquiry.model.dao.ProductQnaInquiryMapper;
import com.sh.shop_kick_n_go.product_qna_inquiry.model.dto.ProductQnaInquiryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductQnaInquiryService {
    private final ProductQnaInquiryMapper productQnaInquiryMapper;

    public ProductQnaInquiryService(ProductQnaInquiryMapper productQnaInquiryMapper) {
        this.productQnaInquiryMapper = productQnaInquiryMapper;
    }

    public List<ProductQnaInquiryDto> findAll() {
        return productQnaInquiryMapper.findAll();
    }

    public ProductQnaInquiryDto findById(int productQnaInquiryId) {
        return productQnaInquiryMapper.findById(productQnaInquiryId);
    }

    public int insert(ProductQnaInquiryDto productQnaInquiryDto) {
        return productQnaInquiryMapper.insert(productQnaInquiryDto);
    }

    public int update(ProductQnaInquiryDto productQnaInquiryDto) {
        System.out.println(productQnaInquiryDto);
        return productQnaInquiryMapper.update(productQnaInquiryDto);
    }

    public int delete(int productQnaInquiryId) {
        return productQnaInquiryMapper.delete(productQnaInquiryId);
    }
}
