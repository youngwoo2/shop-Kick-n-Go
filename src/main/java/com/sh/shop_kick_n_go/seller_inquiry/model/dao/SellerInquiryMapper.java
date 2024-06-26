package com.sh.shop_kick_n_go.seller_inquiry.model.dao;

import com.sh.shop_kick_n_go.seller_inquiry.model.dto.SellerInquiryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SellerInquiryMapper {
    List<SellerInquiryDto> findAll();
    SellerInquiryDto findById(int sellerInquiryId);
    int insert(SellerInquiryDto sellerInquiryDto);
    int update(SellerInquiryDto sellerInquiryDto);
    int delete(int sellerInquiryId);
}
