package com.sh.shop_kick_n_go.order.model.dao;

import com.sh.shop_kick_n_go.order.model.dto.CancelOrderDto;
import com.sh.shop_kick_n_go.order.model.dto.DeliveryDto;
import com.sh.shop_kick_n_go.order.model.dto.OrderDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
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
    
//    @Test
//    @DisplayName("발송 처리")
//    void test4() {
//        // given 임의의 데이터생성
//        int userId = 999;
//        String ordererName = "이영우";
//        String ordererAddress = "삼성중앙역";
//        Timestamp orderDate = "2024-06-01 10:30:00";
//        OrderDto orderDto = new OrderDto();
//        // 새 데이터 입력
//
//        // 수정할 데이터
//
//
//        // 기존 데이터를 유지하면서 가격만 변경
//
//        // when
//
//        // then
//
//    }



}