package com.sh.shop_kick_n_go.order.controller;

import com.sh.shop_kick_n_go.order.model.dto.DeliveryDto;
import com.sh.shop_kick_n_go.order.model.dto.OrderDto;
import com.sh.shop_kick_n_go.order.model.service.OrderQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {
    private final OrderQueryService orderQueryService;

    @GetMapping("/order-tables-data")
    public void orderList(Model model) {
        log.info("Get /NiceAdmin/tables-data");
        List<OrderDto> orders = orderQueryService.findAllOrder();
        model.addAttribute("orders", orders);
    }

    @GetMapping("/delivery-tables-data")
    public void deliveryList(Model model) {
        List<DeliveryDto> deliveries = orderQueryService.findAllDelivery();
        model.addAttribute("deliveries", deliveries);
    }
}
