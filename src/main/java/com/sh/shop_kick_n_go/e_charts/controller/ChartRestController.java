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
    private final ChartQueryService chartQueryService;

    @GetMapping("/gender")
    public List<GenderDto> getGenderData() {
        return chartQueryService.findAllUserGender();
    }

    @GetMapping("/today-order")
    public List<TodayOrderCntDto> getChartsData() {
        return chartQueryService.findAllTodayOrderCnt();
    }

    @GetMapping("/age-gender")
    public List<AgeDto> getAgeData() {
        System.out.println("afafa"+chartQueryService.findAllUserAge().get(0).toString());
        return chartQueryService.findAllUserAge();
    }

}
