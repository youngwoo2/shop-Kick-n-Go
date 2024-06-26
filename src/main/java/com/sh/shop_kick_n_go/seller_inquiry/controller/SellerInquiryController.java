package com.sh.shop_kick_n_go.seller_inquiry.controller;

import com.sh.shop_kick_n_go.seller_inquiry.model.dto.SellerInquiryDto;
import com.sh.shop_kick_n_go.seller_inquiry.model.service.SellerInquiryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sellerInquiries")
public class SellerInquiryController {
    private final SellerInquiryService sellerInquiryService;

    public SellerInquiryController(SellerInquiryService sellerInquiryService) {
        this.sellerInquiryService = sellerInquiryService;
    }

    @GetMapping
    public String list(Model model) {
        List<SellerInquiryDto> sellerInquiries = sellerInquiryService.findAll();
        model.addAttribute("sellerInquiries", sellerInquiries);
        return "sellerInquiries/list";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable int id, Model model) {
        SellerInquiryDto sellerInquiry = sellerInquiryService.findById(id);
        model.addAttribute("sellerInquiry", sellerInquiry);
        return "sellerInquiries/detail";
    }

    @PostMapping
    public String create(SellerInquiryDto sellerInquiryDto) {
        sellerInquiryService.insert(sellerInquiryDto);
        return "redirect:/sellerInquiries";
    }

    @PostMapping("/{id}")
    public String update(@PathVariable int id, SellerInquiryDto sellerInquiryDto) {
        sellerInquiryService.update(sellerInquiryDto);
        return "redirect:/sellerInquiries";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        sellerInquiryService.delete(id);
        return "redirect:/sellerInquiries";
    }
}
