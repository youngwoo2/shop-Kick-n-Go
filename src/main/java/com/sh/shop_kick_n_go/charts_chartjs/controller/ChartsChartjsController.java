package com.sh.shop_kick_n_go.charts_chartjs.controller;

import com.sh.shop_kick_n_go.charts_chartjs.model.dto.TodayOrderSalesDto;
import com.sh.shop_kick_n_go.charts_chartjs.model.service.ChartjsQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/Charts")
@RequiredArgsConstructor
public class ChartsChartjsController {
    private final ChartjsQueryService ChartjsQueryService;

    @GetMapping("/charts-chartjs")
    public List<TodayOrderSalesDto> getChartsData() {
        return ChartjsQueryService.findAllTodayOrderSales();
    }
}
