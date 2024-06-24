package com.purushottam.security_purushottam.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SecurityRestController {

    @GetMapping
    public String sayHello(){
        return "Hello";
    }




}
