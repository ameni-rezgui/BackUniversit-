package org.sesame.session;

import java.util.Collection;

import org.sesame.DAO.Departement;
import org.sesame.Interfmétier.DepartementInterface;
import org.sesame.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartementService implements DepartementInterface {
	
	@Autowired
	DepartementRepository DR;

	@Override
	public Collection<Departement> getAll() {
		// TODO Auto-generated method stub
		return DR.findAll();
	}

	@Override
	public Departement getId(Long id) {
		// TODO Auto-generated method stub
		return DR.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		DR.deleteById(id);
	}

	@Override
	public Departement Add(Departement c) {
		// TODO Auto-generated method stub
		return DR.save(c);
	}
	
	

}
