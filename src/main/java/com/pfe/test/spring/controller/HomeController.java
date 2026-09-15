package com.pfe.test.spring.controller;

import com.pfe.test.spring.specs.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    MyService service;

    @GetMapping
    public List<Integer> method1(){
        List<Integer> returnedList = null;
        for(int i : service.LIST){
            if(i%2 ==0){
                returnedList.add(i);
            }
        }
        return returnedList;
    }



    @GetMapping("/hello")
    public String hello(){
        return service.sayHello();
    }


}
