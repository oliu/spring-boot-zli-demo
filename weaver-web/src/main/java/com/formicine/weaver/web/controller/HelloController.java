package com.formicine.weaver.web.controller;

import com.formicine.weaver.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zli on 2017/5/22.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/sayHi")
    @ResponseBody
    public String sayHi() {
        return "zli say hi";
    }

    @GetMapping("")
    public String hello() {
        String name = "Zli";
        return helloService.hello(name);
    }
}
