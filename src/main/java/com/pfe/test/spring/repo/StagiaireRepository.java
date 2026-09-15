package com.pfe.test.spring.repo;

import com.pfe.test.spring.model.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StagiaireRepository extends JpaRepository<Stagiaire, Integer> {
}
