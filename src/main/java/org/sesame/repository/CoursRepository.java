package org.sesame.repository;

import java.util.List;

import org.sesame.DAO.cours;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository  extends JpaRepository<cours, Long> {

     public List<cours> findByLibelle(String nom); 
     public Page<cours>findByLibelle(String nom, Pageable p );
     public List<cours> findByLibelleContaining(String nom); 
}
 