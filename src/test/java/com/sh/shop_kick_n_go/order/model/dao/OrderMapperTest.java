package com.sh.shop_kick_n_go.order.model.dao;

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
    @DisplayName("배송")
    void test2() {
        // given
        // when
        List<DeliveryDto> deliveries = orderMapper.findAllDelivery();
        System.out.println(deliveries);
        // then
        assertThat(deliveries)
                .isNotNull()
                .isNotEmpty()
                .allMatch((d) -> d != null);
    }
}