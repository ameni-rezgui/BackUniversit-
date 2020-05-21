package org.sesame.Interfmétier;

import java.util.Collection;

import org.sesame.DAO.salle;
import org.sesame.DAO.universites;

public interface SalleInterface {

	public Collection<salle> getAll() ; 
	public salle getId(Long id) ; 
	public void Delete(Long id) ; 
	public salle Add(salle c);
}
