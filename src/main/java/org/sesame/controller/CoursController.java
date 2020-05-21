package org.sesame.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.sesame.DAO.Departement;
import org.sesame.DAO.cours;
import org.sesame.Interfmétier.CoursInterface;

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
@RequestMapping("/cours")
@CrossOrigin("*")
public class CoursController {
	
	@Autowired
	private CoursInterface IFD; 
	
	@PostMapping("/add")
	cours ajoutCours(@RequestBody cours cours)
	{
		if (cours  != null)
		{
			return IFD.Add(cours); 
		}
		return null ; 
	}

	@GetMapping("/get")
	Collection<cours> getAll()
	{
		return IFD.getAll(); 
	}
	
	// Get a Single cours
	@GetMapping("/{id}")
	public cours getCoursById(@PathVariable(value = "id") Long idCours) {
	    return IFD.getId(idCours);
	}
	
	// Update a dept
	@PutMapping("/update/{id}")
	public cours updateCours(@PathVariable(value = "id") Long coursId,
	                                        @Valid @RequestBody cours coursDetails) {

		cours cours = IFD.getId(coursId);

		cours.setLibelle(coursDetails.getLibelle());
		cours.setSalle(coursDetails.getSalle());
		cours.setEnseignants(coursDetails.getEnseignants());
		cours.setEtudiants(coursDetails.getEtudiants());

	cours updatedcours = IFD.Add(cours);
	    return updatedcours; 
	}
	
	
	// Delete a cours
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCours(@PathVariable(value = "id") Long courId) {
	    cours cours =IFD.getId(courId);

	    IFD.Delete(cours.getCode_C());

	    return ResponseEntity.ok().build();
	}
 
	
}
