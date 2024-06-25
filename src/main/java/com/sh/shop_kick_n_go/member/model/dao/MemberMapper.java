package com.sh.shop_kick_n_go.member.model.dao;


import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<MemberDto> findAllUser();

    List<MemberDto> findByUserGrade(String userGrade);

    List<MemberDto> findByAddressCode(int userAddressCode);

    MemberDto findByUserId(int userId);

    int deleteUserInfoByStatus(String withdrawalStatus, int userId);
}
