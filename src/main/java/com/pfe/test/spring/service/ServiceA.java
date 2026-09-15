package com.pfe.test.spring.service;

import com.pfe.test.spring.specs.MyService;

import java.util.Arrays;
import java.util.List;

public class ServiceA implements MyService {

    @Override
    public String sayHello() {
        return "Hello From Service A";
    }
}
