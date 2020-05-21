package org.sesame.session;

import java.util.Collection;

import org.sesame.DAO.enseignant;
import org.sesame.Interfmétier.EnseignantInterface;
import org.sesame.repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnseignatService implements EnseignantInterface {

	
	@Autowired
	EnseignantRepository ER;

	@Override
	public Collection<enseignant> getAll() {
		// TODO Auto-generated method stub
		return ER.findAll();
	}

	@Override
	public enseignant getId(Long id) {
		// TODO Auto-generated method stub
		return ER.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		ER.deleteById(id);
	}

	@Override
	public enseignant Add(enseignant c) {
		// TODO Auto-generated method stub
		return ER.save(c);
	} 
	
	
	
}
