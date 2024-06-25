package com.sh.shop_kick_n_go.total_order.controller;

import com.sh.shop_kick_n_go.total_order.model.dto.TotalOrderDto;
import com.sh.shop_kick_n_go.total_order.model.service.TotalOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/totalOrders")
public class TotalOrderController {

    private final TotalOrderService totalOrderService;

    public TotalOrderController(TotalOrderService totalOrderService) {
        this.totalOrderService = totalOrderService;
    }

    @GetMapping("/charts")
    public String getCharts(Model model) {
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusMonths(1); // 최근 1개월 데이터
        LocalDate endDate = now;

        List<TotalOrderDto> dailySales = totalOrderService.getDailySales(startDate, endDate);
        List<TotalOrderDto> weeklySales = totalOrderService.getWeeklySales(startDate.minusWeeks(12), endDate);
        List<TotalOrderDto> monthlySales = totalOrderService.getMonthlySales(startDate.minusMonths(12), endDate);

        model.addAttribute("dailySales", dailySales);
        model.addAttribute("weeklySales", weeklySales);
        model.addAttribute("monthlySales", monthlySales);

        return "charts-chartjs"; // 반환할 템플릿 이름
    }
}
