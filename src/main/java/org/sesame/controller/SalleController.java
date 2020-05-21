package org.sesame.controller;


import org.sesame.Interfmétier.SalleInterface;
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

import java.util.Collection;

import javax.validation.Valid;

import org.sesame.DAO.salle;
import org.sesame.DAO.universites;

@RestController
@RequestMapping("/salle")
@CrossOrigin("*")
public class SalleController {
	
	@Autowired
	private SalleInterface IFS; 
	
	@PostMapping("/add")
	salle ajoutSalle(@RequestBody salle salle)
	{
		if (salle  != null)
		{
			return IFS.Add(salle); 
		}
		return null ; 
	}

	@GetMapping("/get")
	Collection<salle> getAll()
	{
		return IFS.getAll(); 
	}

	// Get a Single universite
	@GetMapping("/{id}")
	public salle getSalleById(@PathVariable(value = "id") Long idSalle) {
	    return IFS.getId(idSalle);
	}
	
	// Update a Note
	@PutMapping("/update/{id}")
	public salle updateSalle(@PathVariable(value = "id") Long salleId,
	                                        @Valid @RequestBody salle salleDetails) {

		salle salle = IFS.getId(salleId);

		salle.setCapacite(salleDetails.getCapacite());
		salle.setCours(salleDetails.getCours());
		

	 salle updatedSalle = IFS.Add(salle);
	    return updatedSalle; 
	}
	
	
	// Delete a salle
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteSalle(@PathVariable(value = "id") Long salleId) {
	    salle salle =IFS.getId(salleId);

	    IFS.Delete(salle.getNum_s());

	    return ResponseEntity.ok().build();
	}



}
