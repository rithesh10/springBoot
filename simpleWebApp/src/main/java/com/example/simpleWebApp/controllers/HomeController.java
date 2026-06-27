package com.example.simpleWebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greeting() {
        return "Hello world";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    public static class productController {
    }
}
