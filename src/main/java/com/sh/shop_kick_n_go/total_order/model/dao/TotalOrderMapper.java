package com.sh.shop_kick_n_go.total_order.model.dao;

import com.sh.shop_kick_n_go.total_order.model.dto.TotalOrderDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface TotalOrderMapper {
    Integer getTodaySales();

    List<TotalOrderDto> getDailySales(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    List<TotalOrderDto> getWeeklySales(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    List<TotalOrderDto> getMonthlySales(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

    List<TotalOrderDto> getPeriodSales(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
