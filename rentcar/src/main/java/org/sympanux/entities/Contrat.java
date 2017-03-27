package org.sympanux.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Contrat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 70)
	private String NumContrat;
	private Double prix;
	private String dateDebut;
	private String dateFin;
	private String modePaiement;

	@OneToOne(mappedBy = "contrat", fetch = FetchType.LAZY)
	private Agence agence;

	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrat(String numContrat, Double prix, String dateDebut, String dateFin, String modePaiement) {
		super();
		NumContrat = numContrat;
		this.prix = prix;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.modePaiement = modePaiement;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumContrat() {
		return NumContrat;
	}

	public void setNumContrat(String numContrat) {
		NumContrat = numContrat;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}

}
