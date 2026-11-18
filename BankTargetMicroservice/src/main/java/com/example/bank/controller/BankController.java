package com.example.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BankController {

    @GetMapping("/return")
    public Map<String, String> bankReturn() {
        return Map.of(
                "service", "Bank Target Microservice",
                "message", "Bank return request processed successfully",
                "status", "SUCCESS"
        );
    }

    @GetMapping("/account")
    public Map<String, String> account() {
        return Map.of(
                "service", "Bank Target Microservice",
                "message", "Bank account endpoint reached successfully",
                "status", "SUCCESS"
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "service", "Bank Target Microservice",
                "status", "UP"
        );
    }
}
