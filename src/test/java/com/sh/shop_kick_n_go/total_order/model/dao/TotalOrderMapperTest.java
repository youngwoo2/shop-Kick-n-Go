package com.sh.shop_kick_n_go.total_order.model.dao;

import com.sh.shop_kick_n_go.total_order.model.dto.TotalOrderDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TotalOrderMapperTest {

    @Autowired
    private TotalOrderMapper totalOrderMapper;

//    @Test
//    @DisplayName("오늘의 매출 조회")
//    void testGetTodaySales() {
//        // given
//        // when
//        int todaySales = totalOrderMapper.getTodaySales();
//        // then
//        assertThat(todaySales).isNotNegative();
//    }

    @Test
    @DisplayName("일별 매출 조회")
    void testGetDailySales() {
        // given
        LocalDate startDate = LocalDate.now().minusDays(30);
        LocalDate endDate = LocalDate.now();
        LocalDateTime startDateTime = startDate.atStartOfDay();
        LocalDateTime endDateTime = endDate.atTime(LocalTime.MAX);

        // when
        List<TotalOrderDto> dailySales = totalOrderMapper.getDailySales(startDate, endDate);
        // then
        assertThat(dailySales)
                .isNotNull()
                .isNotEmpty()
                .allSatisfy(order -> {
                    assertThat(order.getOrderDate()).isNotNull();
                    assertThat(order.getOrderDate()).isAfterOrEqualTo(startDateTime);
                    assertThat(order.getOrderDate()).isBeforeOrEqualTo(endDateTime);
                    assertThat(order.getTotalPrice()).isPositive();
                });
    }

//    @Test
//    @DisplayName("주별 매출 조회")
//    void testGetWeeklySales() {
//        // given
//        LocalDate startDate = LocalDate.now().minusWeeks(12);
//        LocalDate endDate = LocalDate.now();
//        LocalDateTime startDateTime = startDate.atStartOfDay();
//        LocalDateTime endDateTime = endDate.atTime(LocalTime.MAX);
//
//        // when
//        List<TotalOrderDto> weeklySales = totalOrderMapper.getWeeklySales(startDate, endDate);
//        // then
//        assertThat(weeklySales)
//                .isNotNull()
//                .isNotEmpty()
//                .allSatisfy(order -> {
//                    assertThat(order.getOrderDate()).isNotNull();
//                    assertThat(order.getOrderDate()).isAfterOrEqualTo(startDateTime);
//                    assertThat(order.getOrderDate()).isBeforeOrEqualTo(endDateTime);
//                    assertThat(order.getTotalPrice()).isPositive();
//                });
//    }
//
//    @Test
//    @DisplayName("월별 매출 조회")
//    void testGetMonthlySales() {
//        // given
//        LocalDate startDate = LocalDate.now().minusMonths(12);
//        LocalDate endDate = LocalDate.now();
//        LocalDateTime startDateTime = startDate.atStartOfDay();
//        LocalDateTime endDateTime = endDate.atTime(LocalTime.MAX);
//
//        // when
//        List<TotalOrderDto> monthlySales = totalOrderMapper.getMonthlySales(startDate, endDate);
//        // then
//        assertThat(monthlySales)
//                .isNotNull()
//                .isNotEmpty()
//                .allSatisfy(order -> {
//                    assertThat(order.getOrderDate()).isNotNull();
//                    assertThat(order.getOrderDate()).isAfterOrEqualTo(startDateTime);
//                    assertThat(order.getOrderDate()).isBeforeOrEqualTo(endDateTime);
//                    assertThat(order.getTotalPrice()).isPositive();
//                });
//    }

    @Test
    @DisplayName("특정 기간 매출 조회")
    void testGetPeriodSales() {
        // given
        LocalDate startDate = LocalDate.now().minusMonths(6);
        LocalDate endDate = LocalDate.now();
        LocalDateTime startDateTime = startDate.atStartOfDay();
        LocalDateTime endDateTime = endDate.atTime(LocalTime.MAX);

        // when
        List<TotalOrderDto> periodSales = totalOrderMapper.getPeriodSales(startDate, endDate);
        // then
        assertThat(periodSales)
                .isNotNull()
                .isNotEmpty()
                .allSatisfy(order -> {
                    assertThat(order.getOrderDate()).isNotNull();
                    assertThat(order.getOrderDate()).isAfterOrEqualTo(startDateTime);
                    assertThat(order.getOrderDate()).isBeforeOrEqualTo(endDateTime);
                    assertThat(order.getTotalPrice()).isPositive();
                });
    }
}
