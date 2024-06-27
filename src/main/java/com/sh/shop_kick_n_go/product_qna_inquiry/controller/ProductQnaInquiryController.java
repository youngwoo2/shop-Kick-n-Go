package com.sh.shop_kick_n_go.product_qna_inquiry.controller;

import com.sh.shop_kick_n_go.product_qna_inquiry.model.dto.ProductQnaInquiryDto;
import com.sh.shop_kick_n_go.product_qna_inquiry.model.service.ProductQnaInquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/productQnaInquiries")
@RequiredArgsConstructor
public class ProductQnaInquiryController {
    private final ProductQnaInquiryService productQnaInquiryService;

    @GetMapping
    public String list(Model model) {
        List<ProductQnaInquiryDto> productQnaInquiries = productQnaInquiryService.findAll();

        model.addAttribute("productQnaInquiries", productQnaInquiries);

        return "qna/product-qna";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable int id, Model model) {
        ProductQnaInquiryDto productQnaInquiry = productQnaInquiryService.findById(id);
        model.addAttribute("productQnaInquiry", productQnaInquiry);
        return "productQnaInquiries/detail";
    }


    @PostMapping
    public String create(ProductQnaInquiryDto productQnaInquiryDto) {
        productQnaInquiryService.insert(productQnaInquiryDto);
        return "redirect:/productQnaInquiries";
    }

    @PostMapping("/update")
    public String update(@RequestBody ProductQnaInquiryDto productQnaInquiryDto) {
        productQnaInquiryService.update(productQnaInquiryDto);
        System.out.println(productQnaInquiryDto);
        return "redirect:/productQnaInquiries";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        productQnaInquiryService.delete(id);
        return "redirect:/productQnaInquiries";
    }

}
