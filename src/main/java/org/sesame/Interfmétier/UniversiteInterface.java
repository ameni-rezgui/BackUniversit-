package org.sesame.Interfmétier;

import java.util.Collection;
import java.util.List;

import org.sesame.DAO.universites;
import org.springframework.http.ResponseEntity;

public interface UniversiteInterface {

	public Collection<universites> getAll() ; 
	public universites getId(Long id) ; 

	public void Delete(Long id) ; 
	public universites Add(universites c);
	public List<universites> getByLettre(String lettre);
	public List<universites> getUniversites(String depname); 
	
}
