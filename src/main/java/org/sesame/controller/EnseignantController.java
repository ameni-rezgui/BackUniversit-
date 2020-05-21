package org.sesame.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.sesame.DAO.Etudiant;
import org.sesame.DAO.enseignant;
import org.sesame.Interfmétier.EnseignantInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enseignant")
@CrossOrigin("*")
public class EnseignantController {
	@Autowired
	private EnseignantInterface IFEN; 
	
	@PostMapping("/add")
	enseignant ajoutEnseignant(@RequestBody enseignant enseignant)
	{
		if (enseignant  != null)
		{
			return IFEN.Add(enseignant); 
		}
		return null ; 
	}

	@GetMapping("/get")
	Collection<enseignant> getAll()
	{
		return IFEN.getAll(); 
	}
	// Get a Single Etudiant
	@GetMapping("/{id}")
	public enseignant getEnseignantById(@PathVariable(value = "id") Long idEns) {
	    return IFEN.getId(idEns);
	}
	
	// Update a Note
	@PutMapping("/update/{id}")
	public enseignant updateEnseignant(@PathVariable(value = "id") Long ensId,
	                                        @Valid @RequestBody enseignant enseigantDetails) {

		enseignant enseignant = IFEN.getId(ensId);

		enseignant.setAdresseens(enseigantDetails.getAdresseens());
		enseignant.setCours(enseigantDetails.getCours());
		enseignant.setDepartement(enseigantDetails.getDepartement());
		enseignant.setDiplom(enseigantDetails.getDiplom());
		enseignant.setMatricul(enseigantDetails.getMatricul());
		enseignant.setNomens(enseigantDetails.getNomens());
		enseignant.setPrenomens(enseigantDetails.getPrenomens());
		

	 enseignant updatedEnseignant = IFEN.Add(enseignant);
	    return updatedEnseignant; 
	}
	
	
	// Delete a ens
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEns(@PathVariable(value = "id") Long ensId) {
	    enseignant enseignant =IFEN.getId(ensId);

	    IFEN.Delete(enseignant.getMatricul());

	    return ResponseEntity.ok().build();
	}


}
