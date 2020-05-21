package org.sesame.Interfmétier;

import java.util.Collection;


import org.sesame.DAO.enseignant;

public interface EnseignantInterface {
	public Collection<enseignant> getAll() ; 
	public enseignant getId(Long id) ; 
	public void Delete(Long id) ; 
	public enseignant Add(enseignant c);
	
}
