package org.sesame.repository;


import org.sesame.DAO.enseignant;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<enseignant, Long> {

	public List<enseignant> findByAdresseens(String Adresse); 
	public Page<enseignant> findByAdresseens(String adresse, Pageable p );
	public List<enseignant> findByNomens(String nom); 
	public List<enseignant> findByDiplom(String diplome); 
	public List<enseignant> findByPrenomens(String prenom); 
	public List<enseignant> findByNomensContaining(String a);
} 
