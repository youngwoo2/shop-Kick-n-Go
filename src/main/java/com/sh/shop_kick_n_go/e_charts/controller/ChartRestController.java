package com.sh.shop_kick_n_go.e_charts.controller;

import com.sh.shop_kick_n_go.e_charts.model.dto.TodayOrderCntDto;
import com.sh.shop_kick_n_go.e_charts.model.service.ChartQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/EChart")
@RequiredArgsConstructor
public class ChartRestController {
    private final ChartQueryService ChartQueryService;

    @GetMapping("/charts-data")
    public List<TodayOrderCntDto> getChartsData() {
        return ChartQueryService.findAllTodayOrderCnt();
    }
}
