package com.sh.shop_kick_n_go.menu.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Long categoryCode;
    private String categoryName;
    private Long refCategoryCode;
}
