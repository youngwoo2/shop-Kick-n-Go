package com.sh.shop_kick_n_go.order.model.service;

import com.sh.shop_kick_n_go.order.model.dao.OrderMapper;
import com.sh.shop_kick_n_go.order.model.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderQueryService {
    private final OrderMapper orderMapper;
    public List<OrderDto> findAllOrder() {
        return orderMapper.findAllOrder();
    }
}
