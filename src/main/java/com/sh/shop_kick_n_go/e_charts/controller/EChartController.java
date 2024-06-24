package com.sh.shop_kick_n_go.e_charts.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/EChart")
public class EChartController {
    @GetMapping("/charts")
    public String charts(Model model) {
        return "charts-apexcharts";
    }
}
