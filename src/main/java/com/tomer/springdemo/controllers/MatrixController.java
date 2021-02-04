package com.tomer.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/matrix")
public class MatrixController {
    @RequestMapping(method = RequestMethod.GET, path = "/wake-up")
    @ResponseBody
    public String wakeUp() {
        return "Wake up neo...";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/follow")
    @ResponseBody
    public String follow() {
        return "follow the white rabbit...";
    }


}
