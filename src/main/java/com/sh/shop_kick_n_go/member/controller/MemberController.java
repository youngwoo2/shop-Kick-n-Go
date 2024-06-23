package com.sh.shop_kick_n_go.member.controller;


import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import com.sh.shop_kick_n_go.member.model.service.MemberService;
import groovy.util.logging.Slf4j;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/NiceAdmin")
public class MemberController {

    private final MemberService service;

    @GetMapping("/login")
    public String loginForm(String name, Model model) {
        model.addAttribute("name", name);
            return "NiceAdmin/pages-login";

    }


    @PostMapping("/NiceAdmin")
    public String login(@RequestParam("id") Long id, String password, HttpSession session, RedirectAttributes redirectAttributes) {

        MemberDto loginMember = service.login(id, password);
        if (loginMember == null) {
            redirectAttributes.addFlashAttribute("loginFail", "아이디가 잘못 입력되었습니다 ");
            return "redirect:/";
        }
        session.setAttribute("name", loginMember.getName());
        redirectAttributes.addAttribute("name", loginMember.getName());

        return "redirect:/NiceAdmin/pages-login";

    }

        @PostMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return  "redirect:/member/logout";}



}

