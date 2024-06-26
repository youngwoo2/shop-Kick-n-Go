package com.sh.shop_kick_n_go.product_qna_inquiry.model.dao;

import com.sh.shop_kick_n_go.product_qna_inquiry.model.dto.ProductQnaInquiryDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ProductQnaInquiryMapperTest {

    @Autowired
    private ProductQnaInquiryMapper productQnaInquiryMapper;

    @Test
    @Transactional
    public void testFindAll() {
        List<ProductQnaInquiryDto> inquiries = productQnaInquiryMapper.findAll();
        assertThat(inquiries).isNotEmpty();
        inquiries.forEach(inquiry -> System.out.println("Inquiry: " + inquiry));
    }

    @Test
    @Transactional
    public void testFindById() {
        ProductQnaInquiryDto inquiry = productQnaInquiryMapper.findById(1);
        assertThat(inquiry).isNotNull();
        System.out.println("Inquiry: " + inquiry);
    }

    @Test
    @Disabled
    @Transactional
    public void testInsert() {
        ProductQnaInquiryDto inquiry = new ProductQnaInquiryDto(4, 1, 1, LocalDateTime.now(), LocalDateTime.now(), "미답변", "상품", "테스트 문의", "테스트 내용", "테스트 답변");
        int result = productQnaInquiryMapper.insert(inquiry);
        assertThat(result).isEqualTo(1);
        System.out.println("Insert result: " + result);
    }

    @Test
    @Disabled
    @Transactional
    public void testUpdate() {
        ProductQnaInquiryDto inquiry = productQnaInquiryMapper.findById(1);
        inquiry.setTitle("수정된 제목");
        int result = productQnaInquiryMapper.update(inquiry);
        assertThat(result).isEqualTo(1);
        System.out.println("Update result: " + result);
    }

    @Test
    @Transactional
    public void testDelete() {
        int result = productQnaInquiryMapper.delete(1);
        assertThat(result).isEqualTo(1);
        System.out.println("Delete result: " + result);
    }
}
