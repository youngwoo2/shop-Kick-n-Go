package com.sh.shop_kick_n_go.order.model.dao;

import com.sh.shop_kick_n_go.order.model.dto.CancelOrderDto;
import com.sh.shop_kick_n_go.order.model.dto.DeliveryDto;
import com.sh.shop_kick_n_go.order.model.dto.OrderDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderMapperTest {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    @DisplayName("주문 전체 조회")
    void test1() {
        // given
        // when
        List<OrderDto> orders = orderMapper.findAllOrder();
        System.out.println(orders);
        // then
        assertThat(orders)
                .isNotNull()
                .isNotEmpty()
                .allMatch((m) -> {
                    System.out.println(m);
                    return m != null;
                });
    }

    @Test
    @DisplayName("배송조회")
    void test2() {
        // given
        // when
        List<OrderDto> deliveries = orderMapper.findAllDelivery();
        System.out.println(deliveries);
        // then
        assertThat(deliveries)
                .isNotNull()
                .isNotEmpty()
                .allMatch((d) -> d != null);
    }




    @Test
    @DisplayName("취소주문 조회")
    void test3() {
        // given
        // when
        List<OrderDto> cancelOrders = orderMapper.findAllCancelOrder();
        System.out.println(cancelOrders);
        // then
        assertThat(cancelOrders)
                .isNotEmpty()
                .isNotNull()
                .allMatch((c) -> c != null);
    }

}