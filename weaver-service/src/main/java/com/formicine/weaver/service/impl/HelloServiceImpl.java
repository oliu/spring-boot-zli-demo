package com.formicine.weaver.service.impl;

import com.formicine.weaver.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by zli on 2017/5/22.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        System.out.println("==================================");
        return "Hello " + name;
    }
}
