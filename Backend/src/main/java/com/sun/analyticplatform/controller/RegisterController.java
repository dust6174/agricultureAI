package com.sun.analyticplatform.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class RegisterController {

    @PostMapping("/register")
    public  String register(){
        return "1";
        //return "0";
    }
}
