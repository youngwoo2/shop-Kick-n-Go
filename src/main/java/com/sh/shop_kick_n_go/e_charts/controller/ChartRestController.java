package com.sh.shop_kick_n_go.e_charts.controller;

import com.sh.shop_kick_n_go.e_charts.model.dto.AgeDto;
import com.sh.shop_kick_n_go.e_charts.model.dto.GenderDto;
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
@RequestMapping("/api/e-chart")
@RequiredArgsConstructor
public class ChartRestController {
    private final ChartQueryService ChartQueryService;

    @GetMapping("/gender")
    public List<GenderDto> getGenderData() {
        return ChartQueryService.findAllUserGender();
    }

    @GetMapping("/today-order")
    public List<TodayOrderCntDto> getChartsData() {
        return ChartQueryService.findAllTodayOrderCnt();
    }

    @GetMapping("/age")
    public List<AgeDto> getAgeData() {
        return ChartQueryService.findAllUserAge();
    }

}
