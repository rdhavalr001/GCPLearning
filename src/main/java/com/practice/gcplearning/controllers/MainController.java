package com.practice.gcplearning.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Dhaval
 */
@RestController
public class MainController {

    @RequestMapping("/")
    public String helloEndpoint() {
        return "Hello guys how are you";
    }

    @RequestMapping("*")
    public String fallbackEndpoint() {
        return "Hello guys how are you anyway";
    }

}
