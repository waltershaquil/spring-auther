package com.dev.auther.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secure-endpoint")
public class SecureController {
    @GetMapping
    public String secureEndpoint() {
        return "Secure Endpoint";
    }
}
