package com.example.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String helll(Model model) {
        model.addAttribute("name", "hello");
        return "hello";
      }
}
