package com.sh.shop_kick_n_go.member.model.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private Long id;
    private String username;
    private String password;
    private String name;
    private String email;
    private Timestamp createdAt;
}
