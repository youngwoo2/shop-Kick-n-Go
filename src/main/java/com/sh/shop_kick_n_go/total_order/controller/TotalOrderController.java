package com.sh.shop_kick_n_go.total_order.controller;

import com.sh.shop_kick_n_go.total_order.model.service.TotalOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chart")
public class TotalOrderController {

    private final TotalOrderService totalOrderService;

    public TotalOrderController(TotalOrderService totalOrderService) {
        this.totalOrderService = totalOrderService;
    }

    @GetMapping("/charts")
    public String getCharts(Model model) {
        return "charts-chartjs"; // 반환할 템플릿 이름
    }
}
