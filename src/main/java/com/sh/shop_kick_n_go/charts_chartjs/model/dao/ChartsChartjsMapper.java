package com.sh.shop_kick_n_go.charts_chartjs.model.dao;

import com.sh.shop_kick_n_go.charts_chartjs.model.dto.TodayOrderSalesDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChartsChartjsMapper {
    List<TodayOrderSalesDto> findAllTodayOrderSales();
}
