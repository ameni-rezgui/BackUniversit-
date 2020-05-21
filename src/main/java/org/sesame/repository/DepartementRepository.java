package org.sesame.repository;

import java.util.List;

import org.sesame.DAO.Departement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement, Long> {

	public List<Departement> findByNomdep(String nom); 
	public Page<Departement> findByNomdep(String nom, Pageable p );
	public List<Departement> findByNomdepContaining(String nom); 
	
}
