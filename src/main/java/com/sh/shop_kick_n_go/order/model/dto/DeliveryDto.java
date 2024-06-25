package com.sh.shop_kick_n_go.order.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryDto {
    private int deliveryId;
    private int orderId;
    private String trackingNumber;
    private Timestamp shippingDate;
    private OrderDto orderDto;
}
