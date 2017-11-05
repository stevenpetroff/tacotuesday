package com.petroff.tacotuesday.TacoTuesday.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
