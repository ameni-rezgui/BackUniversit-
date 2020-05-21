package org.sesame.DAO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Departement implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codedep;
	private String nomdep;
	@ManyToOne
	@JoinColumn(name = "codeuniv")
	private universites universites;

	public Long getCodedep() {
		return codedep;
	}

	public void setCodedep(Long codedep) {
		this.codedep = codedep;
	}

	public String getNomdep() {
		return nomdep;
	}

	public void setNomdep(String nomdep) {
		this.nomdep = nomdep;
	}

	public universites getUniversites() {
		return universites;
	}

	public void setUniversites(universites universites) {
		this.universites = universites;
	}

	public Departement(Long codedep, String nomdep, org.sesame.DAO.universites universites) {
		super();
		this.codedep = codedep;
		this.nomdep = nomdep;
		this.universites = universites;
	}

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Departement [codedep=" + codedep + ", nomdep=" + nomdep + ", universites=" + universites + "]";
	}

}
