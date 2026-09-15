package com.pfe.test.spring.service;

import com.pfe.test.spring.model.Stagiaire;
import com.pfe.test.spring.repo.StagiaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StagiaireService {

    private StagiaireRepository stagiaireRepository;


    public List<Stagiaire> findAllStagiaires(){
        return stagiaireRepository.findAll();
    }


}
