package com.sh.shop_kick_n_go.member.model.service;


import com.sh.shop_kick_n_go.member.model.dao.MemberMapper;
import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

    public List<MemberDto> findAllUser() {
        return memberMapper.findAllUser();
    }


    public void deleteUserInfoByStatus(List<String> userIds, String withdrawalStatus) {
        for (String userId : userIds) {
            Integer userIdInt = Integer.valueOf(userId);
            MemberDto member = memberMapper.findByUserId(userIdInt);

            if (member == null) {
                log.error("User with ID {} does not exist.", userId);
                throw new IllegalArgumentException("User with ID " + userId + " 가 삭제되었습니다.");
            }

            log.info("Found user: {}", member);

            if (!"Y".equals(member.getWithdrawalStatus())) {
                log.warn("User with ID {} is not in withdrawal status.", userId);
                throw new IllegalArgumentException("탈퇴 상태가 아닌 회원은 정보를 삭제할 수 없습니다");
            }

            memberMapper.deleteUserInfoByStatus(userId, withdrawalStatus);
        }

    }
}