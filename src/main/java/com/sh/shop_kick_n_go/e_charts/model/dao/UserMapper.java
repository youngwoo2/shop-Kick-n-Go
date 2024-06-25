package com.sh.shop_kick_n_go.e_charts.model.dao;

import com.sh.shop_kick_n_go.e_charts.model.dto.AgeDto;
import com.sh.shop_kick_n_go.e_charts.model.dto.GenderDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<GenderDto> findAllUserGender();
    List<AgeDto> findAllUserAge();
}
