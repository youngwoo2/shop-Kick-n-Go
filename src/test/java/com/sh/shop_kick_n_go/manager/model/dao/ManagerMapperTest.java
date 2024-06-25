package com.sh.shop_kick_n_go.manager.model.dao;

import com.sh.shop_kick_n_go.manager.model.dto.ManagerDto;
import com.sh.shop_kick_n_go.manager.model.service.ManagerService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ManagerMapperTest {
    @Autowired
    private ManagerService managerService;
   @Test
   @DisplayName("매니저 로그인 테스트")
   void test1 () {
       // given
      final String managerEmail = "manager1@naver.com";
      final String managerPassword = "password1";
       // when
       ManagerDto managerDto = managerService.compareLoginInfo(managerEmail, managerPassword);
       // then
       assertThat(managerDto).isNotNull()
               .satisfies(
                       (_managerDto) -> assertThat(managerDto.getManagerEmail()).isEqualTo(managerEmail),
                       (_managerDto) -> assertThat(managerDto.getManagerPassword()).isEqualTo(managerPassword));
   }
}