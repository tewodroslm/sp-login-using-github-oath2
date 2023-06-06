package com.ted.spauthaws.spauthAwsElastic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class HomeController {

//    @GetMapping({"/", "hello"})
//    public String getHome(@RequestParam(required = false, defaultValue = "World") String name, Model model){
//        model.addAttribute("name", name);
//        return "hello-world";
//    }

    @GetMapping({"/", "hello"})
    public String getHomeTwo(Model model, Principal principal){
        model.addAttribute("name", principal.getName());
        return "hello-world";
    }

    @GetMapping("/login")
    public String login(Model model, Principal principal){
        return "custom-login";
    }

}
