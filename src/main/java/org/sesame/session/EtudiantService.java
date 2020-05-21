package org.sesame.session;

import java.util.Collection;

import org.sesame.DAO.Etudiant;
import org.sesame.Interfmétier.EtudiantInterface;
import org.sesame.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService implements EtudiantInterface {
	
	@Autowired
	EtudiantRepository ER;

	@Override
	public Collection<Etudiant> getAll() {
		// TODO Auto-generated method stub
		return ER.findAll();
	}

	@Override
	public Etudiant getId(Long id) {
		// TODO Auto-generated method stub
		return ER.getOne(id);
	}

	@Override
	public void Delete(Long id) {
		// TODO Auto-generated method stub
		ER.deleteById(id);
	}

	@Override
	public Etudiant Add(Etudiant e) {
		// TODO Auto-generated method stub
		return ER.save(e);
	} 
	
	
	

}
