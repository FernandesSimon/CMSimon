package com.simon.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdministrationController {

    @GetMapping("/administration")
    public String showAdmin(){
        return "administration";
    }

}
