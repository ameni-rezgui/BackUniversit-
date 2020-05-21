package org.sesame.DAO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class salle {
	@Id
	private Long num_s;
	private String nom;
	private Long capacite;
	@OneToOne
	@JoinColumn(name = "code_C")
	private cours cours;

	public Long getNum_s() {
		return num_s;
	}

	public void setNum_s(Long num_s) {
		this.num_s = num_s;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Long getCapacite() {
		return capacite;
	}

	public void setCapacite(Long capacite) {
		this.capacite = capacite;
	}

	public cours getCours() {
		return cours;
	}

	public void setCours(cours cours) {
		this.cours = cours;
	}

	@Override
	public String toString() {
		return "salle [num_s=" + num_s + ", nom=" + nom + ", capacite=" + capacite + ", cours=" + cours + "]";
	}

	public salle(Long num_s, String nom, Long capacite, org.sesame.DAO.cours cours) {
		super();
		this.num_s = num_s;
		this.nom = nom;
		this.capacite = capacite;
		this.cours = cours;
	}

	public salle() {
		super();
		// TODO Auto-generated constructor stub
	}

}
