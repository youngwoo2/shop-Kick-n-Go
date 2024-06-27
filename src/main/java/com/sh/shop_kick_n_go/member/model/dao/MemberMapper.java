package com.sh.shop_kick_n_go.member.model.dao;


import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {
    // 회원 정보 전체 조회
    List<MemberDto> findAllUser();
    // 회원 등급별 조회
    List<MemberDto> findByUserGrade(String userGrade);
    // 회원 주소 코드로 조회
    List<MemberDto> findByAddressCode(int userAddressCode);
    // UserId로 회원 조회
    MemberDto findByUserId(int userId);
    // 회원 withdrawalStatus 가 'Y' 인경우 회원 정보 삭제 가능
    void deleteUserInfoByStatus(@Param("userId") String userId, @Param("withdrawalStatus") String withdrawalStatus);
    // 매출액이 0 ~ 200,000 = 일반회원 , 200,000 ~ 500,000 = VIP, 500,000 ~ = VVIP
    void updateUserGrade();
}
