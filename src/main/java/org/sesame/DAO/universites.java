package org.sesame.DAO;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class universites implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeuniv;
	private String nomuniv;
	private String ardesseSite;
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@OneToMany(mappedBy = "universites", cascade = CascadeType.ALL)
	private Collection<Departement> Departements;

	public Long getCodeuniv() {
		return codeuniv;
	}

	public void setCodeuniv(Long codeuniv) {
		this.codeuniv = codeuniv;
	}

	public String getNomuniv() {
		return nomuniv;
	}

	public void setNomuniv(String nomuniv) {
		this.nomuniv = nomuniv;
	}

	public String getArdesseSite() {
		return ardesseSite;
	}

	public void setArdesseSite(String ardesseSite) {
		this.ardesseSite = ardesseSite;
	}

	public Collection<Departement> getDepartements() {
		return Departements;
	}

	public void setDepartements(Collection<Departement> departements) {
		Departements = departements;
	}

	@Override
	public String toString() {
		return "universites [codeuniv=" + codeuniv + ", nomuniv=" + nomuniv + ", ardesseSite=" + ardesseSite
				+ ", Departements=" + Departements + "]";
	}

	public universites() {
		super();
		// TODO Auto-generated constructor stub
	}

	public universites(Long codeuniv, String nomuniv, String ardesseSite, Collection<Departement> departements) {
		super();
		this.codeuniv = codeuniv;
		this.nomuniv = nomuniv;
		this.ardesseSite = ardesseSite;
		Departements = departements;
	}
	
	

}
