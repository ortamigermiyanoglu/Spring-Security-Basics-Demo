package com.sumutella.basicspringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sumutella
 * @time 1:47 PM
 * @since 11/12/2019, Tue
 */
@Controller
public class MySpringSecurityDemoController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }
}
