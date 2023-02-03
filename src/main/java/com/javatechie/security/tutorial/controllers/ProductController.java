package com.javatechie.security.tutorial.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome: this endpoint has no authentication nor authorisation.";
    }

    @GetMapping("/all")

}
