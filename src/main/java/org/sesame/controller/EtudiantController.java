package org.sesame.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.sesame.DAO.Etudiant;
import org.sesame.DAO.salle;
import org.sesame.Interfmétier.EtudiantInterface;
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
@RequestMapping("/etudiant")
@CrossOrigin("*")
public class EtudiantController {
	@Autowired
	private EtudiantInterface IFE; 
	
	@PostMapping("/add")
	Etudiant ajoutEtudiant(@RequestBody Etudiant etudiant)
	{
		if (etudiant  != null)
		{
			return IFE.Add(etudiant); 
		}
		return null ; 
	}

	@GetMapping("/get")
	Collection<Etudiant> getAll()
	{
		return IFE.getAll(); 
	}
	
	// Get a Single Etudiant
		@GetMapping("/{id}")
		public Etudiant getEtudiantById(@PathVariable(value = "id") Long idEtudiant) {
		    return IFE.getId(idEtudiant);
		}
		
		// Update a Note
		@PutMapping("/update/{id}")
		public Etudiant updateEtudiant(@PathVariable(value = "id") Long etudiantId,
		                                        @Valid @RequestBody Etudiant etudiantDetails) {

			Etudiant etudiant = IFE.getId(etudiantId);

			etudiant.setAdresseetu(etudiantDetails.getAdresseetu());
			etudiant.setCours(etudiantDetails.getCours());
			etudiant.setDateentee(etudiantDetails.getDateentee());
			etudiant.setEnseignants(etudiantDetails.getEnseignants());
			
			etudiant.setPrenomrtu(etudiantDetails.getPrenomrtu());
			

		 Etudiant updatedEtudiant = IFE.Add(etudiant);
		    return updatedEtudiant; 
		}
		
		
		// Delete a salle
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<?> deleteSalle(@PathVariable(value = "id") Long etudId) {
		    Etudiant etudiant =IFE.getId(etudId);

		    IFE.Delete(etudiant.getNuminsc());

		    return ResponseEntity.ok().build();
		}

	

}
