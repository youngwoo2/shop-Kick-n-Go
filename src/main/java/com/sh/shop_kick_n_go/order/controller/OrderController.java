package com.sh.shop_kick_n_go.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/create")
    public void create() {}

}
