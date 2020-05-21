package org.sesame.session;

import java.util.Collection;

import org.sesame.DAO.cours;
import org.sesame.Interfmétier.CoursInterface;
import org.sesame.repository.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CoursService implements CoursInterface{
	
	@Autowired
	private CoursRepository CR;

	@Override
	public Collection<cours> getAll() {
		// TODO Auto-generated method stub
		return CR.findAll();
	}

	@Override
	public cours getId(Long id) {
		// TODO Auto-generated method stub
		return CR.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		 CR.deleteById(id);
	}
	

	@Override
	public cours Add(cours c) {
		// TODO Auto-generated method stub
		return CR.save(c);
	} 
	
	
	
	
	

}
