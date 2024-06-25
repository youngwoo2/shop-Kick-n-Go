package com.sh.shop_kick_n_go.member.model.service;


import com.sh.shop_kick_n_go.member.model.dao.MemberMapper;
import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import groovy.util.logging.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;

//    public List<MemberDto> findAllUser() {
//        return memberMapper.findAllUser();
//    }
}

