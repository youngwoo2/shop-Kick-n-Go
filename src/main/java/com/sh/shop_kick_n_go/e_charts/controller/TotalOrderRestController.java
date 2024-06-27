package com.sh.shop_kick_n_go.e_charts.controller;

import com.sh.shop_kick_n_go.e_charts.model.dto.TotalOrderDto;
import com.sh.shop_kick_n_go.e_charts.model.service.TotalOrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/totalOrders")
@RequiredArgsConstructor
public class TotalOrderRestController {

    private final TotalOrderService totalOrderService;

    @GetMapping("/daily-sales")
    public List<TotalOrderDto> getDailySales() {
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusDays(1); // 최근 1일 데이터
        LocalDate endDate = now;

        return totalOrderService.getDailySales(startDate, endDate);

    }
    @GetMapping("/daily-sales-sum")
    public int getDailySalesSum() {
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusDays(1); // 최근 1일 데이터
        return totalOrderService.getDailySales(startDate, now).stream().mapToInt(TotalOrderDto::getTotalPrice).sum();
    }

    @GetMapping("/weekly-sales")
    public List<TotalOrderDto> getWeeklySales() {
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusWeeks(1); // 최근 1주 데이터
        LocalDate endDate = now;

        return totalOrderService.getWeeklySales(startDate, endDate);
    }
    @GetMapping("/weekly-sales-sum")
    public int getWeeklySalesSum() {
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusWeeks(1); // 최근 1주 데이터
        LocalDate endDate = now;

        return totalOrderService.getWeeklySales(startDate, endDate).stream().mapToInt(TotalOrderDto::getTotalPrice).sum();
    }

    @GetMapping("/monthly-sales")
    public List<TotalOrderDto> getMonthlySales() {
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusMonths(1); // 최근 1개월 데이터
        LocalDate endDate = now;

        return totalOrderService.getMonthlySales(startDate, endDate);
    }
    @GetMapping("/monthly-sales-sum")
    public int getMonthlySalesSum() {
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusMonths(1); // 최근 1개월 데이터
        return totalOrderService.getMonthlySales(startDate, now).stream().mapToInt(TotalOrderDto::getTotalPrice).sum();
    }


    @GetMapping("/period-sales")
    public List<TotalOrderDto> getPeriodSales(LocalDate startDate, LocalDate endDate) {
        return totalOrderService.getPeriodSales(startDate, endDate);
    }
}
