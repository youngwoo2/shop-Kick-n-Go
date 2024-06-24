package com.sh.shop_kick_n_go.manager.model.service;

import com.sh.shop_kick_n_go.manager.model.dao.ManagerMapper;
import com.sh.shop_kick_n_go.manager.model.dto.ManagerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManagerService {
    private final ManagerMapper managerMapper;


    public ManagerDto compareLoginInfo(String managerEmail, String managerPassword) {
            return managerMapper.compareLoginInfo(managerEmail,managerPassword);


    }
}
