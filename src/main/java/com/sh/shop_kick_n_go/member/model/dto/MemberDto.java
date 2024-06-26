package com.sh.shop_kick_n_go.member.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private int userId;
    private String userEmail;
    private int userAge;
    private String userName;
    private String userPassword;
    private Timestamp createdDate;
    private String gender;
    private String userAddress;
    private int addressCode;
    private String userGrade;
    private int userConsumption;
    private String withdrawalStatus;
}
