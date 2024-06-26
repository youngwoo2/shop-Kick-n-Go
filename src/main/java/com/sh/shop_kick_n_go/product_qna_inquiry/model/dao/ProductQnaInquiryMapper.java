package com.sh.shop_kick_n_go.product_qna_inquiry.model.dao;

import com.sh.shop_kick_n_go.product_qna_inquiry.model.dto.ProductQnaInquiryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductQnaInquiryMapper {
    List<ProductQnaInquiryDto> findAll();
    ProductQnaInquiryDto findById(int productQnaInquiryId);
    int insert(ProductQnaInquiryDto productQnaInquiryDto);
    int update(ProductQnaInquiryDto productQnaInquiryDto);
    int delete(int productQnaInquiryId);
}
