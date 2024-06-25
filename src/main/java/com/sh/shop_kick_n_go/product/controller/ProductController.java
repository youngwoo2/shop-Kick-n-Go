package com.sh.shop_kick_n_go.product.controller;

import com.sh.shop_kick_n_go.product.model.dto.ProductDto;
import com.sh.shop_kick_n_go.product.model.dto.ProductRegistDto;
import com.sh.shop_kick_n_go.product.model.service.ProductCommandService;
import com.sh.shop_kick_n_go.product.model.service.ProductQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Slf4j

@RequestMapping(value = "/")

@RequiredArgsConstructor
public class ProductController {
    private final ProductQueryService productQueryService;
    private final ProductCommandService productCommandService;

    @GetMapping("/product-search-update")
    // 상품조회/수정_상품 모두 띄우기
    public void list(Model model){
        log.info("GET /product/search");
        List<ProductDto> products = productQueryService.findAll();
        model.addAttribute("products", products);
    }

    @PostMapping("/product-regist")
    // 상품등록
    public String regist(@ModelAttribute ProductRegistDto productRegistDto, RedirectAttributes redirectAttributes){
        log.info("POST /product/regist");
        log.debug("productRegistDto = {}", productRegistDto);
        ProductDto productDto = productRegistDto.toProductDto();
        int result = productCommandService.insertProduct(productDto);
//        redirectAttributes.addFlashAttribute("message", "메뉴를 성공적으로 등록했습니다.");
        return "redirect:/product-regist";
    }

    @PostMapping("/product-search-update")
    // 상품조회/수정_수정한 값 가져오기
    public String update(ProductDto productDto, RedirectAttributes redirectAttributes){
        log.info("POST /product/update");
        log.debug("productDto = {}", productDto);
        int result = productCommandService.updateProduct(productDto);
//        redirectAttributes.addFlashAttribute("message", "메뉴를 성공적으로 수정했습니다.");
        return "redirect:/product-search-update";
    }

//    @PostMapping("/product-delete")
//    // 상품삭제
//    public String delete(@ModelAttribute ProductDto productDto, ProductDto productId, RedirectAttributes redirectAttributes){
//        log.info("POST /product/delete");
//        log.debug("productRegistDto = {}", productDto);
//        List<ProductDto> products = productCommandService.deleteChecked(productId);
////        redirectAttributes.addFlashAttribute("message", "메뉴를 성공적으로 수정했습니다.");
//        return "redirect:/product-tables-data";
//    }
}