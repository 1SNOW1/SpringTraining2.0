package com.cydeo.controller;


import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(){
        return "home.html";
    }

    @RequestMapping("/ozzy")
    public String getHomePage2(){
        return "home.html";
    }

    @RequestMapping //if no parameters are given, then that will be set as default
    public String getHomePage3(){
        return "home.html";
    }

    @RequestMapping({"/apple", "/orange"})
    public String getHomePage4(){
        return "home.html";
    }
}
