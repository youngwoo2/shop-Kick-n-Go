package com.sh.shop_kick_n_go.charts_chartjs.model.service;

import com.sh.shop_kick_n_go.charts_chartjs.model.dao.ChartsChartjsMapper;
import com.sh.shop_kick_n_go.charts_chartjs.model.dto.TodayOrderSalesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true) // 하위 메소드에서는 읽기만 가능, 쓰기작업 불가
public class ChartjsQueryService {
    private final ChartsChartjsMapper chartsChartjsMapper;

    public List<TodayOrderSalesDto> findAllTodayOrderSales() {
        return chartsChartjsMapper.findAllTodayOrderSales();
    }
}
