package com.sh.shop_kick_n_go.e_charts.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgeDto {
    private int userId;
    private String gender;
    private int userAge;
}