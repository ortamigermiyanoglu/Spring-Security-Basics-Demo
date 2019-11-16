package com.sumutella.basicspringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sumutella
 * @time 1:47 PM
 * @since 11/12/2019, Tue
 */
@Controller
public class MySpringSecurityDemoController  {




    @GetMapping("/my-login")
    public String showLogin(){
        return "login";
    }


    @GetMapping("/")
    public String showLanding() {
        return "landing";
    }

    @GetMapping("/employees")
    public String showHome() {
        return "home";
    }

    @GetMapping("/manager")
    public String showManagerHome() {
        return "manager-home";
    }

    @GetMapping("/access-denied")
    public String showAccessDenied(){
        return "access-denied";
    }
}
