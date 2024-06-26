package com.sh.shop_kick_n_go.product.controller;

import com.sh.shop_kick_n_go.product.model.dto.*;
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
@RequestMapping(value = "/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductQueryService productQueryService;
    private final ProductCommandService productCommandService;

    @GetMapping("/product-search-update")
    // 상품조회/수정_상품 모두 띄우기
    public void search(Model model){
        log.info("GET /product/search");
        List<ProductDto> products = productQueryService.findAll();
        model.addAttribute("products", products);
    }

    @PostMapping("/product-search-update")
    // 상품조회/수정_수정한 값 가져오기
    public String update(@RequestParam(name = "checkboxEach", required = false) List<Integer> productId, RedirectAttributes redirectAttributes){
        log.info("POST /product/update");
        log.debug("productDto = {}", productId);
        int result = productCommandService.updateProduct(productId);
//        redirectAttributes.addFlashAttribute("message", "메뉴를 성공적으로 수정했습니다.");
        return "redirect:/product/product-search-update";
    }

    @GetMapping("/product-regist")
    // 상품등록
    public void regist(Model model){
        log.info("GET /product/regist");
    }

    @PostMapping("/product-regist")
    // 상품등록
    public String regist(@ModelAttribute ProductRegistDto productRegistDto, RedirectAttributes redirectAttributes){
        log.info("POST /product/regist");
        log.debug("productRegistDto = {}", productRegistDto);
        ProductDto productDto = productRegistDto.toProductDto();
        int result = productCommandService.insertProduct(productDto);
//        redirectAttributes.addFlashAttribute("message", "메뉴를 성공적으로 등록했습니다.");
        return "redirect:/product/product-regist";
    }
}