package org.sesame.repository;

import java.util.Collection;
import java.util.List;

import org.sesame.DAO.universites;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface UniversiteRepository extends JpaRepository<universites, Long > {

	public List<universites> findByNomuniv(String nom);
	
	// pageable  : objet ou on va définit le taille d'une page
	public Page<universites> findByNomuniv(String nom, Pageable p );
	
	public List<universites> findByNomunivContaining(String a);
	
	public List<universites> findByArdesseSite(String Adresse); 
	
	//public List<universites> findUniversites(String depname); 
	
  
}
