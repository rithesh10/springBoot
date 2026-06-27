package com.example.myWebApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet()
    {
        System.out.println("Hello World");
//        Scanner sc=new Scanner(System)
        return "hello world";
    }
}
