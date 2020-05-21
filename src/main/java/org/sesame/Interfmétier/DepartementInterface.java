package org.sesame.Interfmétier;

import java.util.Collection;

import org.sesame.DAO.Departement;


public interface DepartementInterface {
	public Collection<Departement> getAll() ; 
	public Departement getId(Long id) ; 
	public void Delete(Long id) ; 
	public Departement Add(Departement c);
	
}
