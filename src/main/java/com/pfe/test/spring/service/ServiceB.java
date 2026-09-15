package com.pfe.test.spring.service;

import com.pfe.test.spring.specs.MyService;
import org.springframework.stereotype.Service;

@Service
public class ServiceB implements MyService {
    @Override
    public String sayHello() {
        return "Hello From Service B";
    }
}
