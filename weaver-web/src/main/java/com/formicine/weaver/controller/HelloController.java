package com.formicine.weaver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zli on 2017/5/22.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/sayHi")
    @ResponseBody
    public String sayHi() {
        return "zli say hi";
    }
}
