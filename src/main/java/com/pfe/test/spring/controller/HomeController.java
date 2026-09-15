package com.pfe.test.spring.controller;

import com.pfe.test.spring.model.Stagiaire;
import com.pfe.test.spring.service.StagiaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    StagiaireService service;

    @GetMapping
    public ResponseEntity<List<Stagiaire>> getAllStagiaires(){
        return ResponseEntity.ok(service.findAllStagiaires());
    }

    @GetMapping("/test")
    public ResponseEntity<List<Stagiaire>> filtrerStagiaires(){
        List<Stagiaire> returnedList = new ArrayList<>();
        for(Stagiaire s :  returnedList){
            if(s.getAge() > 20){
                returnedList.add(s);
            }
        }
        return ResponseEntity.ok(service.findAllStagiaires());
    }


}
