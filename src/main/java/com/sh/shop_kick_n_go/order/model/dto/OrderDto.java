package com.sh.shop_kick_n_go.order.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private int orderId;
    private int userId;
    private String ordererName;
    private String ordererAddress;
    private Timestamp orderDate;
    private String status;
    private int totalPrice;

    private List<OrderItemDto> orderItemList;
}
