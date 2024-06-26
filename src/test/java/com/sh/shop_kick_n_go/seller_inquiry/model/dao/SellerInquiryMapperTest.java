package com.sh.shop_kick_n_go.seller_inquiry.model.dao;

import com.sh.shop_kick_n_go.seller_inquiry.model.dto.SellerInquiryDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SellerInquiryMapperTest {

    @Autowired
    private SellerInquiryMapper sellerInquiryMapper;

    @Test
    @Transactional
    public void testFindAll() {
        List<SellerInquiryDto> inquiries = sellerInquiryMapper.findAll();
        assertThat(inquiries).isNotEmpty();
        inquiries.forEach(inquiry -> System.out.println("Inquiry: " + inquiry));
    }

    @Test
    @Transactional
    public void testFindById() {
        SellerInquiryDto inquiry = sellerInquiryMapper.findById(1);
        assertThat(inquiry).isNotNull();
        System.out.println("Inquiry: " + inquiry);
    }

    @Test
    @Disabled
    @Transactional
    public void testInsert() {
        SellerInquiryDto inquiry = new SellerInquiryDto(4, 1, 1, LocalDateTime.now(), LocalDateTime.now(), "미답변", "QA", "테스트 문의", "테스트 내용", "테스트 답변");
        int result = sellerInquiryMapper.insert(inquiry);
        assertThat(result).isEqualTo(1);
        System.out.println("Insert result: " + result);
    }

    @Test
    @Disabled
    @Transactional
    public void testUpdate() {
        SellerInquiryDto inquiry = sellerInquiryMapper.findById(1);
        inquiry.setTitle("수정된 제목");
        int result = sellerInquiryMapper.update(inquiry);
        assertThat(result).isEqualTo(1);
        System.out.println("Update result: " + result);
    }

    @Test
    @Disabled
    @Transactional
    public void testDelete() {
        int result = sellerInquiryMapper.delete(1);
        assertThat(result).isEqualTo(1);
        System.out.println("Delete result: " + result);
    }
}
