package org.sesame.Interfmétier;

import java.util.Collection;

import org.sesame.DAO.Etudiant;


public interface EtudiantInterface {
	public Collection<Etudiant> getAll() ; 
	public Etudiant getId(Long id) ; 
	public void Delete(Long id) ; 
	public Etudiant Add(Etudiant e);
}
