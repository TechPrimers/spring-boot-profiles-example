package com.techprimers.profiles.springprofilesexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/hello")
@RestController
public class HelloResource {


    @Value("${spring.message}")
    private String message;

    @GetMapping
    public String hello() {
        return message;
    }
}
