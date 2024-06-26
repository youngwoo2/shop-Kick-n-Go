package com.sh.shop_kick_n_go.member.controller;


import com.sh.shop_kick_n_go.member.model.dto.MemberDto;
import com.sh.shop_kick_n_go.member.model.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/user-tables-data")
    public String findAllUser(Model model, @RequestParam(value = "message", required = false) String message,
                              @RequestParam(value = "errorMessage", required = false) String errorMessage) {
        List<MemberDto> memberDtos = memberService.findAllUser();
        model.addAttribute("memberDtos", memberDtos);
        if (message != null) {
            model.addAttribute("message", message);
        }
        if (errorMessage != null) {
            model.addAttribute("errorMessage", errorMessage);
        }
        return "user/user-tables-data";
    }

    @PostMapping("/deleteUserInfoByStatus")
    public String deleteUserInfoByStatus(@RequestParam("userIds") List<String> userIds,
                                         @RequestParam("withdrawalStatus") String withdrawalStatus,
                                         RedirectAttributes redirectAttributes) {
        try {
            log.info("Received user IDs for deletion: {}", userIds);
            memberService.deleteUserInfoByStatus(userIds, withdrawalStatus);
            redirectAttributes.addAttribute("message", "Selected users have been deleted successfully.");
        } catch (IllegalArgumentException e) {
            log.error("Error deleting users: {}", e.getMessage());
            redirectAttributes.addAttribute("errorMessage", e.getMessage());
        }
        return "redirect:/user/user-tables-data";
    }
//    @GetMapping("/user-tables-data")
//    public String goTable(){
//        return "user/user-tables-data";
//    }

}


