package com.sh.shop_kick_n_go.order.model.service;

import com.sh.shop_kick_n_go.order.model.dao.OrderMapper;
import com.sh.shop_kick_n_go.order.model.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderCommandService {
    private final OrderMapper orderMapper;
    public int updateOrder(List<Integer> selectedOrders) {
        return orderMapper.updateOrder(selectedOrders);
    }

    public int processCanceling(List<Integer> selectedOrders) {
        return orderMapper.processCanceling(selectedOrders);
    }

    public int processCompletion(List<Integer> selectedOrders) {
        return orderMapper.processCompletion(selectedOrders);
    }

    public int cancelOrderApprove(List<Integer> canceledOrders) {
        return orderMapper.cancelOrderApprove(canceledOrders);
    }

    public int cancelOrderWithdraw(List<Integer> canceledOrders) {
        return orderMapper.cancelOrderWithdraw(canceledOrders);
    }
}
