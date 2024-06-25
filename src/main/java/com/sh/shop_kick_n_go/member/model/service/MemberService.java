package com.sh.shop_kick_n_go.member.model.service;


import com.sh.shop_kick_n_go.member.model.dao.MemberMapper;
import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import groovy.util.logging.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    private final MemberMapper memberMapper;


    public MemberDto login(String userEmail, String userPassword) {

        return memberMapper.read(userEmail, userPassword);
    }
}
