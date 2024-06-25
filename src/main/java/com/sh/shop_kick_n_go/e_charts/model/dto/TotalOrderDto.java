package com.sh.shop_kick_n_go.e_charts.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TotalOrderDto {
    private int orderId;
    private int userId;
    private String ordererName;
    private String ordererAddress;
    private LocalDateTime orderDate;
    private String status;
    private int totalPrice;
}
