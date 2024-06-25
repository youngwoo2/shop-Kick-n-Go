package com.sh.shop_kick_n_go.charts_chartjs.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodayOrderSalesDto {
    private int orderId;
    private LocalDateTime orderDate;
    private int totalPrice;
}
