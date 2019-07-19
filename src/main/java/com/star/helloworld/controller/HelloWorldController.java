package com.star.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/hanxiao")
public class HelloWorldController {

    @RequestMapping()
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello!!!");
        return "hello";
    }
}