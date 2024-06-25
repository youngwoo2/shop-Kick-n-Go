package com.sh.shop_kick_n_go.order.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
    private int orderItemId;
    private int orderId;
    private int productId;
    private String itemName;
    private int quantity;
}
