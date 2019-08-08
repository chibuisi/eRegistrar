package edu.mum.cs425.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/eregistrar/home", "/eregistrar/home", "/eregistrar", "/eregistrar"} )
    public String home(){
        return "home/index";
    }
}
