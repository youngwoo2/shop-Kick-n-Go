package com.sh.shop_kick_n_go.e_charts.model.dao;


import com.sh.shop_kick_n_go.e_charts.model.dto.TodayOrderCntDto;
import com.sh.shop_kick_n_go.menu.model.dto.CategoryDto;
import com.sh.shop_kick_n_go.menu.model.dto.MenuDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChartMapper {
    List<TodayOrderCntDto> findAllTodayOrderCnt();
}
