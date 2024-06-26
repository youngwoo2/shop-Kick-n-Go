package com.sh.shop_kick_n_go.member.model.dao;


import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {

    List<MemberDto> findAllUser();

    List<MemberDto> findByUserGrade(String userGrade);

    List<MemberDto> findByAddressCode(int userAddressCode);

    MemberDto findByUserId(int userId);

    void deleteUserInfoByStatus(@Param("userId") String userId, @Param("withdrawalStatus") String withdrawalStatus);

    void updateUserGrade();
}
