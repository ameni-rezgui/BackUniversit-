package org.sesame.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.sesame.DAO.Departement;
import org.sesame.DAO.enseignant;
import org.sesame.Interfmétier.DepartementInterface;
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
@RequestMapping("/departement")
@CrossOrigin("*")
public class DepartementController {
	@Autowired
	private DepartementInterface IFD; 
	
	@PostMapping("/add")
	Departement ajoutDepartement(@RequestBody Departement departement)
	{
		if (departement  != null)
		{
			return IFD.Add(departement); 
		}
		return null ; 
	}

	@GetMapping("/get")
	Collection<Departement> getAll()
	{
		return IFD.getAll(); 
	}
	
	// Get a Single Departement
	@GetMapping("/{id}")
	public Departement getDepartementById(@PathVariable(value = "id") Long idDept) {
	    return IFD.getId(idDept);
	}
	
	// Update a dept
	@PutMapping("/update/{id}")
	public Departement updateDepartement(@PathVariable(value = "id") Long deptId,
	                                        @Valid @RequestBody Departement deptDetails) {

		Departement dept = IFD.getId(deptId);

		dept.setNomdep(deptDetails.getNomdep());
		dept.setUniversites(deptDetails.getUniversites());
		
		

	 Departement updatedDepartement = IFD.Add(dept);
	    return updatedDepartement; 
	}
	
	
	// Delete a dept
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteDepartement(@PathVariable(value = "id") Long deptId) {
	    Departement departement =IFD.getId(deptId);

	    IFD.Delete(departement.getCodedep());

	    return ResponseEntity.ok().build();
	}

	

}
