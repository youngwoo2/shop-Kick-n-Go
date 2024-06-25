package com.sh.shop_kick_n_go.e_charts.model.service;

import com.sh.shop_kick_n_go.e_charts.model.dao.TotalOrderMapper;
import com.sh.shop_kick_n_go.e_charts.model.dto.TotalOrderDto;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class TotalOrderService {
    private final TotalOrderMapper totalOrderMapper;

    public TotalOrderService(TotalOrderMapper totalOrderMapper) {
        this.totalOrderMapper = totalOrderMapper;
    }

    public int getTodaySales() {
        Integer result = totalOrderMapper.getTodaySales();
        return result != null ? result : 0;
    }

    public List<TotalOrderDto> getDailySales(LocalDate startDate, LocalDate endDate) {
        return totalOrderMapper.getDailySales(startDate, endDate);
    }

    public List<TotalOrderDto> getWeeklySales(LocalDate startDate, LocalDate endDate) {
        return totalOrderMapper.getWeeklySales(startDate, endDate);
    }

    public List<TotalOrderDto> getMonthlySales(LocalDate startDate, LocalDate endDate) {
        return totalOrderMapper.getMonthlySales(startDate, endDate);
    }

    public List<TotalOrderDto> getPeriodSales(LocalDate startDate, LocalDate endDate) {
        return totalOrderMapper.getPeriodSales(startDate, endDate);
    }
}
