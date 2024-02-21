package com.mockmastery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/test")
public class TestController {

    @GetMapping(name = "/oauth")
    public String testOAuth() {
        return "OAuth Worked 50%";
    }
}
