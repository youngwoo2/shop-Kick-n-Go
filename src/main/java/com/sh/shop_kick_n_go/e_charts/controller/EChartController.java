package com.sh.shop_kick_n_go.e_charts.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("chart")
public class EChartController {
    @GetMapping("/charts-apexcharts")
    public void charts(Model model) {
    }
    @GetMapping("/charts-chartjs")
    public void getCharts(Model model) {
    }
}
