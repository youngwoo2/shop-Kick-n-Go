package com.sh.shop_kick_n_go.seller_inquiry.model.service;

import com.sh.shop_kick_n_go.seller_inquiry.model.dao.SellerInquiryMapper;
import com.sh.shop_kick_n_go.seller_inquiry.model.dto.SellerInquiryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerInquiryService {
    private final SellerInquiryMapper sellerInquiryMapper;

    public SellerInquiryService(SellerInquiryMapper sellerInquiryMapper) {
        this.sellerInquiryMapper = sellerInquiryMapper;
    }

    public List<SellerInquiryDto> findAll() {
        return sellerInquiryMapper.findAll();
    }

    public SellerInquiryDto findById(int sellerInquiryId) {
        return sellerInquiryMapper.findById(sellerInquiryId);
    }

    public int insert(SellerInquiryDto sellerInquiryDto) {
        return sellerInquiryMapper.insert(sellerInquiryDto);
    }

    public int update(SellerInquiryDto sellerInquiryDto) {
        return sellerInquiryMapper.update(sellerInquiryDto);
    }

    public int delete(int sellerInquiryId) {
        return sellerInquiryMapper.delete(sellerInquiryId);
    }
}
