package org.sesame.DAO;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class cours {
	@Id
	@GeneratedValue
	private Long code_C;
	private String libelle;
	@ManyToMany(mappedBy = "cours")
	private Collection<Etudiant> etudiants;
	@OneToOne
	@JoinColumn(name = "num_s")
	private salle salle;
	@OneToMany(mappedBy = "cours")
	private Collection<enseignant> enseignants;

	public Long getCode_C() {
		return code_C;
	}

	public void setCode_C(Long code_C) {
		this.code_C = code_C;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Collection<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(Collection<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public salle getSalle() {
		return salle;
	}

	public void setSalle(salle salle) {
		this.salle = salle;
	}

	public Collection<enseignant> getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(Collection<enseignant> enseignants) {
		this.enseignants = enseignants;
	}

	public cours(Long code_C, String libelle, Collection<Etudiant> etudiants, org.sesame.DAO.salle salle,
			Collection<enseignant> enseignants) {
		super();
		this.code_C = code_C;
		this.libelle = libelle;
		this.etudiants = etudiants;
		this.salle = salle;
		this.enseignants = enseignants;
	}

	public cours() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "cours [code_C=" + code_C + ", libelle=" + libelle + ", etudiants=" + etudiants + ", salle=" + salle
				+ ", enseignants=" + enseignants + "]";
	}

}
