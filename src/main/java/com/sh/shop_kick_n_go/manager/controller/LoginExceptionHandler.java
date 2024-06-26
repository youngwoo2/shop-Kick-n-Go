package com.sh.shop_kick_n_go.manager.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@ControllerAdvice
//public class LoginExceptionHandler {


//    @ExceptionHandler(NullPointerException.class)
//    public String NullPointExeptionHandler(NullPointerException nex, Model model){
//        model.addAttribute("errormessage", nex.getMessage());
//        return "login-error-message";
//    }

//    @GetMapping("/login-error-message")
//    public String showErrorMessage(){
//        return "/login-error-message";
//    }
//}
