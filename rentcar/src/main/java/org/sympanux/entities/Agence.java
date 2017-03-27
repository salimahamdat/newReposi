package org.sympanux.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agence implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 70)
	private String nomAgence;
	private String AdresseAgence;
	private String ville;
	private String faxe;
	private String fixe;
	private String gsm;

	@OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
	private Collection<Vehicule> vehicule;

	@ManyToOne
	@JoinColumn(name = "ID_COMPT")
	private CompteAdmin compteadmin;

	@OneToOne
	@JoinColumn(name = "ID_CONTRAT")
	private Contrat contrat;

	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agence(String nomAgence, String adresseAgence, String ville) {
		super();
		this.nomAgence = nomAgence;
		this.AdresseAgence = adresseAgence;
		this.ville = ville;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	public String getAdresseAgence() {
		return AdresseAgence;
	}

	public void setAdresseAgence(String adresseAgence) {
		AdresseAgence = adresseAgence;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getFaxe() {
		return faxe;
	}

	public void setFaxe(String faxe) {
		this.faxe = faxe;
	}

	public String getFixe() {
		return fixe;
	}

	public void setFixe(String fixe) {
		this.fixe = fixe;
	}

	public String getGsm() {
		return gsm;
	}

	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public Collection<Vehicule> getVehicule() {
		return vehicule;
	}

	public void setVehicule(Collection<Vehicule> vehicule) {
		this.vehicule = vehicule;
	}

	public CompteAdmin getCompteadmin() {
		return compteadmin;
	}

	public void setCompteadmin(CompteAdmin compteadmin) {
		this.compteadmin = compteadmin;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

}
