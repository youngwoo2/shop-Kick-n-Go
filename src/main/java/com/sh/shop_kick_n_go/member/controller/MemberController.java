package com.sh.shop_kick_n_go.member.controller;


import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import com.sh.shop_kick_n_go.member.model.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

    @GetMapping("/login")
    public String loginForm(Model model, HttpSession session, HttpServletRequest httpServletRequest) {
        httpServletRequest.getParameter("name");
        MemberDto memberDto = (MemberDto) session.getAttribute("user");
        model.addAttribute("name", memberDto.getUserName());


        return "member/login";

    }


    @PostMapping("/login")
    public String login(@RequestParam("email") String userEmail, String userPassword, HttpSession session, RedirectAttributes redirectAttributes) {

        MemberDto loginMember = service.login(userEmail, userPassword);
        if (loginMember == null) {
            redirectAttributes.addFlashAttribute("loginFail", "아이디가 잘못 입력되었습니다 ");
            return "redirect:/";
        }
        session.setAttribute("user", loginMember);

        return "redirect:/member/login";

    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        log.info("로그아웃");
        return "redirect:/member/logout";
    }


}

