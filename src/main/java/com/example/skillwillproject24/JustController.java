package com.example.skillwillproject24;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustController {

    @GetMapping("/Hello")
    public String greating(){
        return "gamarjoba skillwill";
    }
}
