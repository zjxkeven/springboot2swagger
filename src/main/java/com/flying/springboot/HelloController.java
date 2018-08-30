package com.flying.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
//@EnableAutoConfiguration
//@SpringBootApplication
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello ,spring boot!";
    }
/*
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }*/
    
}