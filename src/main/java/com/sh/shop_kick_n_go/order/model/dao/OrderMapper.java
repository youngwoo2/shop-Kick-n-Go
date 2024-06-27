package com.sh.shop_kick_n_go.order.model.dao;

import com.sh.shop_kick_n_go.order.model.dto.CancelOrderDto;
import com.sh.shop_kick_n_go.order.model.dto.DeliveryDto;
import com.sh.shop_kick_n_go.order.model.dto.OrderDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<OrderDto> findAllOrder();

    List<OrderDto> findAllDelivery();

    List<OrderDto> findAllCancelOrder();

    int updateOrder(List<Integer> selectedOrders);

    int processCanceling(List<Integer> selectedOrders);

    int processCompletion(List<Integer> selectedOrders);

    int cancelOrderApprove(List<Integer> canceledOrders);

    int cancelOrderWithdraw(List<Integer> canceledOrders);
}
