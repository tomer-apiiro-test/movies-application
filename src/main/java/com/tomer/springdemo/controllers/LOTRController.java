package com.tomer.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/lotr")
public class LOTRController {
    @RequestMapping()
    @ResponseBody
    public String shallNotPass() {
        return "You shallnot pass!!!!";
    }
}
