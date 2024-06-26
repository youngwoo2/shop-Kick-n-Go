package com.sh.shop_kick_n_go.member.model.service;



import com.sh.shop_kick_n_go.member.model.dao.MemberMapper;
import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MemberServiceTest {
    @Autowired
    private MemberMapper memberMapper;

    @Test
    @DisplayName("User 전체 조회")
    void test1() {
        // when
        List<MemberDto> memberDtos = memberMapper.findAllUser();
        // then
        assertThat(memberDtos).isNotNull();


    }

    @Test
    @DisplayName("회원 등급별 조히")
    void test2() {
        //given
        String userGrade = "일반회원";
        // when
        List<MemberDto> memberDtos = memberMapper.findByUserGrade(userGrade);
        System.out.println(memberDtos);
        // then
        assertThat(memberDtos).isNotNull();
    }

    @Test
    @DisplayName("지역별 조회")
    void test3() {
        // given
        int userAddressCode = 1044;
        // when
        List<MemberDto> memberDtos = memberMapper.findByAddressCode(userAddressCode);
        System.out.println(memberDtos);
        // then
        assertThat(memberDtos).isNotNull()
                .satisfies(memberDto -> assertThat(memberDto.get(0).getAddressCode()).isEqualTo(userAddressCode));


    }

    @Test
    @DisplayName("유저 id로 조회")
    void test4() {
        // given
        int userId = 8;
        // when
        MemberDto memberDto = memberMapper.findByUserId(userId);
        // then
        assertThat(memberDto).isNotNull()
                .satisfies(
                        (_memberDto -> assertThat(_memberDto.getUserId()).isEqualTo(userId)));

    }
//    @Test
//    @DisplayName("withdrawalStatus가 Y면 회원 삭제 가능")
//    void test5() {
//        // given
//        String withdrawalStatus = "Y";
//        int userId = 15;
        // when
//        int result = memberMapper.deleteUserInfoByStatus(withdrawalStatus, userId);
        // then
//        assertThat(result).isEqualTo(1);


//        @Test
//        @DisplayName("유저 grade 업데이트하는 쿼리 만들어보자 ")
//        void test6() {
//            // given
//            int userId =22;
//            // when
//            int result  = memberMapper.updateUserGrade();
//            // then
//            assertThat(result).isNotNull()
//                    .satisfies(re -> assertThat(result)).isEqualTo(1);
//
//        }
    }



//}