package com.springbootapp.springbootappname.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
 
    @GetMapping("/")
    public String  index() {
        return "Index Page";
    }
 
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
     @GetMapping("/about")
    public String about() {
        return "about";
    }
   
}
