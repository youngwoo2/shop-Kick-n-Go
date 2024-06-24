package com.sh.shop_kick_n_go.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/charts")
    public String create() {
        return "/charts-chartjs";
    }
    @GetMapping("/apex-charts")
    public String apexCharts() {
        return "/charts-apexcharts";
    }

    @GetMapping("/e-charts")
    public String echarts() {
        return "/charts-echarts";
    }
}
