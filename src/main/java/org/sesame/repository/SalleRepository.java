package org.sesame.repository;

import java.util.List;

import org.sesame.DAO.salle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<salle, Long > {
	
public List<salle> findByNom(String nom) ;

//pageable  : objet ou on va définit le taille d'une page
	public Page<salle> findByNom(String nom, Pageable p );
	public List<salle> findByNomContaining(String a);
   public List<salle> findByCapacite(Long capacite); 


	
	
}
