package com.sh.shop_kick_n_go.e_charts.model.service;

import com.sh.shop_kick_n_go.e_charts.model.dao.ChartMapper;
import com.sh.shop_kick_n_go.e_charts.model.dao.UserMapper;
import com.sh.shop_kick_n_go.e_charts.model.dto.AgeDto;
import com.sh.shop_kick_n_go.e_charts.model.dto.GenderDto;
import com.sh.shop_kick_n_go.e_charts.model.dto.TodayOrderCntDto;
import com.sh.shop_kick_n_go.menu.model.dao.MenuMapper;
import com.sh.shop_kick_n_go.menu.model.dto.MenuDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true) // 하위 메소드에서는 읽기만 가능, 쓰기작업 불가
public class ChartQueryService {

    private final ChartMapper chartMapperMapper;
    private final UserMapper userMapper;

    public List<TodayOrderCntDto> findAllOrderCnt() {
        return chartMapperMapper.findAllOrderCnt();
    }
    public List<TodayOrderCntDto> findAllTodayOrderCnt() {
        return chartMapperMapper.findAllTodayOrderCnt();
    }
    public List<GenderDto> findAllUserGender() {
        return userMapper.findAllUserGender();
    }
    public List<AgeDto> findAllUserAge() {
        return userMapper.findAllUserAge();
    }
}
