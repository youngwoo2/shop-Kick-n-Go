package com.sh.shop_kick_n_go.member.model.dao;

import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    @DisplayName("로그인 조회")
    void test1() {
        // given
        String userEmail = "id1.com";
        String userPassword = "password1";
        // when
        MemberDto memberDto = memberMapper.read(userEmail, userPassword);
        //then
        assertThat(memberDto)
                .isNotNull()
                .satisfies(
                        (member) -> assertThat(member.getUserEmail()).isEqualTo(userEmail),
                        (member) -> assertThat(member.getUserPassword()).isEqualTo(userPassword)
                );
    }
}