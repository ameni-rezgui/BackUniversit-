package org.sesame.session;

import java.util.Collection;

import org.sesame.DAO.salle;
import org.sesame.Interfmétier.SalleInterface;
import org.sesame.repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalleService implements SalleInterface{

	
	@Autowired
	SalleRepository SR;

	@Override
	public Collection<salle> getAll() {
		// TODO Auto-generated method stub
		return SR.findAll();
	}

	@Override
	public salle getId(Long id) {
		// TODO Auto-generated method stub
		return SR.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		SR.deleteById(id);
	}

	@Override
	public salle Add(salle c) {
		// TODO Auto-generated method stub
		return SR.save(c);
	} 
	
	
}
