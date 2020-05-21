package org.sesame.repository;

import java.util.List;

import org.sesame.DAO.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long > {
	public List<Etudiant> findByAdresseetu(String adresse);
	public List<Etudiant> findByNometu(String nom);
	
	// pageable  : objet ou on va définit le taille d'une page
	public Page<Etudiant> findByAdresseetu(String adresse, Pageable p );
	public Page<Etudiant> findByNometu(String adresse, Pageable p );
	public List<Etudiant> findByNometuContaining(String a);
	
}
