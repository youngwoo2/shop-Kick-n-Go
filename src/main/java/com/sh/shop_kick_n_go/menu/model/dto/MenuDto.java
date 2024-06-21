package com.sh.shop_kick_n_go.menu.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuDto {
    private Long menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private OrderableStatus orderableStatus;
}
