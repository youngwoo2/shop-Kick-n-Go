package com.sh.shop_kick_n_go.manager.model.dao;

import com.sh.shop_kick_n_go.manager.model.dto.ManagerDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerMapper {
    ManagerDto compareLoginInfo(String managerEmail, String managerPassword);
}
