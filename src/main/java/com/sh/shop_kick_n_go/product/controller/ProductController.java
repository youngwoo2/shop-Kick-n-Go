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
@RequestMapping(value = "/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductQueryService productQueryService;
    private final ProductCommandService productCommandService;

//    @RequestMapping(value = "/NiceAdmin/tables-data", method = RequestMethod.GET)
    @GetMapping("/list")
    public void list(Model model){
        log.info("GET /product/list");
        List<ProductDto> products = productQueryService.findAll();
        model.addAttribute("products", products);
//        return "product-tables-data";
    }

//    @RequestMapping(value = "/NiceAdmin/forms-elements", method = RequestMethod.POST)
    @PostMapping("/forms-elements")
    public String regist(@ModelAttribute ProductRegistDto productRegistDto, RedirectAttributes redirectAttributes){
        log.info("POST /product/regist");
        log.debug("productRegistDto = {}", productRegistDto);
        ProductDto productDto = productRegistDto.toProductDto();
        int result = productCommandService.insertProduct(productDto);
//        redirectAttributes.addFlashAttribute("message", "메뉴를 성공적으로 등록했습니다.");
        return "redirect:/product/forms-elements";
    }
}
