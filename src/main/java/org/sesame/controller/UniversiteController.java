package org.sesame.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.sesame.DAO.universites;
import org.sesame.Interfmétier.UniversiteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
@RequestMapping("/universite")
@CrossOrigin( "*")

public class UniversiteController {
	
	@Autowired
	private UniversiteInterface IF; 
	
	
	@PostMapping("/add")
	universites ajoutunersite(@RequestBody universites universite)
	{
		if (universite != null)
		{
			return IF.Add(universite); 
		}
		return null ; 
	}
	
	@GetMapping("/get")
	Collection<universites> getAll()
	{
		return IF.getAll(); 
	}
	
	// Get a Single universite
	@GetMapping("/get/{id}")
	public universites getUniversiteById(@PathVariable Long id) {
	    return IF.getId(id);
	}
	
	
		@GetMapping("/getu/{mc}")
		public List<universites> getUniversiteByLettre(@PathVariable String mc) {
		    return IF.getByLettre(mc);
		}
		
		@GetMapping("/{mc}")
		public List<universites> getUniversites(@PathVariable String mc) {
		    return IF.getByLettre(mc);
		}
	
	@PutMapping("/update/{id}")
	public universites updateUniversite(@PathVariable Long id,
	                                        @Valid @RequestBody universites universiteDetails) {

		universites universite = IF.getId(id);

		universite.setNomuniv(universiteDetails.getNomuniv());
		universite.setArdesseSite(universiteDetails.getArdesseSite());

		universites updatedUniversite = IF.Add(universite);
	    return updatedUniversite;
	}
	
	
	// Delete a Note
	@DeleteMapping("/delete/{id}")
	public void deleteUniversite(@PathVariable Long id) {
	   

	    IF.Delete(id);

	}
	
	
	
	


}
