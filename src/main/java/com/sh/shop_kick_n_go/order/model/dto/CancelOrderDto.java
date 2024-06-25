package com.sh.shop_kick_n_go.order.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CancelOrderDto {
    private int cancelOrderId;
    private int orderId;
    private Timestamp paymentDate;
    private String cancellationStatus;
    private Timestamp cancellationRequestDate;
    private String cancellationReason;
}
