package com.sh.shop_kick_n_go.charts_chartjs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/charts")
public class ChartjsController {
    @GetMapping("/chartjs")
    public String charts(Model model) {
        return "charts-chartjs";
    }
}
