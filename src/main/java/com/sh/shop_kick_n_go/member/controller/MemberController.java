package com.sh.shop_kick_n_go.member.controller;


import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import com.sh.shop_kick_n_go.member.model.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("")
public class MemberController {

    @Autowired
    private MemberService memberService;

//    List<MemberDto> memberDto = memberService.findAllUser();
}


