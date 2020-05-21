package org.sesame.Interfmétier;

import java.util.Collection;

import org.sesame.DAO.cours;



public interface CoursInterface {
	public Collection<cours> getAll() ; 
	public cours getId(Long id) ; 
	public void Delete(Long id) ; 
	public cours Add(cours c);
	
}
