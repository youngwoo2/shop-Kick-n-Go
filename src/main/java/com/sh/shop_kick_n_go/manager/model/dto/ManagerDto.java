package com.sh.shop_kick_n_go.manager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerDto {

    private String managerEmail;
    private String managerPassword;
    private String managerName;

}
