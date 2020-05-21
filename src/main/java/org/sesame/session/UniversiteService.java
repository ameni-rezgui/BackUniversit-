package org.sesame.session;

import java.util.Collection;

import javax.transaction.Transactional;

import org.sesame.DAO.universites;
import org.sesame.Interfmétier.UniversiteInterface;
import org.sesame.repository.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UniversiteService implements UniversiteInterface {

	@Autowired
	private UniversiteRepository RU;

	@Override
	public Collection<universites> getAll() {
		// TODO Auto-generated method stub
		return RU.findAll();
	}

	@Override
	public universites getId(Long id) {
		// TODO Auto-generated method stub
		return RU.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
	       RU.deleteById(id);
	       
	}
	@Override
	public universites Add(universites c) {
		// TODO Auto-generated method stub
		return RU.save(c);
	}

	@Override
	public List<universites> getByLettre(String lettre) {
		// TODO Auto-generated method stub
		return RU.findByNomunivContaining(lettre);
	}

	@Override
	public List<universites> getUniversites(String depname) {
		// TODO Auto-generated method stub
		return RU.findByNomunivContaining(depname);
	}

	
	
	
	
	
	
}
