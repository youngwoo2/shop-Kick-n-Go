package com.sh.shop_kick_n_go.manager.controller;

import com.sh.shop_kick_n_go.manager.model.dto.ManagerDto;
import com.sh.shop_kick_n_go.manager.model.service.ManagerService;
import com.sh.shop_kick_n_go.member.model.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class ManagerController {
    private final ManagerService managerService;
    private final MemberService memberService;

    // 맨처음 Login 화면 -> index 파일임
    @PostMapping("/login")
    public String registLoginInfo(@RequestParam("id") String managerEmail, @RequestParam("password") String managerPassword, HttpSession session, RedirectAttributes redirectAttributes) {

        ManagerDto managerDto = managerService.compareLoginInfo(managerEmail, managerPassword);

        if (managerDto == null) {
            throw new NullPointerException("입력하신 아이디와, 비밀번호 중 하나가 일치하지 않는 것 같습니다.");

        }
        session.setAttribute("managerDto", managerDto);
        return "redirect:/dashboard";
    }

    // 로그인 성공 했을시에 dashboard로 redirect
    @GetMapping("/dashboard")
    public String goDashboard() {
//        memberService.testCode();
        return "/dashboard";
    }

    @GetMapping("/login")
    public String failLogin() {

        return "login";
    }


}
