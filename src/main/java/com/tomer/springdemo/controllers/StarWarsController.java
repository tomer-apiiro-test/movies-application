package com.tomer.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sw")
public class StarWarsController {

    @RequestMapping("/is-trap")
    @ResponseBody
    public String itsATrap() {
        return "It's a trap!";
    }

    @RequestMapping("/try")
    @ResponseBody
    public String padwanTry() {
        return "There is do, or do not. there is not try...";
    }
}
