package org.sympanux.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 70)
	private String nomVehicule;
	private String marque;
	private String modele;
	private String type;
	private String immatricule;
	private String boiteVitesse;
	private String couleur;
	private String carburant;
	private Integer nombreDePlace;
	private Double kilometrage;
	private Integer nombreDePorte;

	@ManyToOne
	@JoinColumn(name = "ID_AGENCE")
	private Agence agence;

	@ManyToOne
	@JoinColumn(name = "ID_COMPT")
	private CompteAdmin compteadmin;

	@ManyToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
	private Collection<Service> service;

	public Vehicule() {
		super();
	}

	public Vehicule(String marque, String couleur, Integer nombreDePorte) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.nombreDePorte = nombreDePorte;
	}

	public Vehicule(String nomVehicule, String marque, String modele, String type, String immatricule,
			String boiteVitesse, String couleur, String carburant, Integer nombreDePlace, Double kilometrage,
			Integer nombreDePorte, Agence agence) {
		super();
		this.nomVehicule = nomVehicule;
		this.marque = marque;
		this.modele = modele;
		this.type = type;
		this.immatricule = immatricule;
		this.boiteVitesse = boiteVitesse;
		this.couleur = couleur;
		this.carburant = carburant;
		this.nombreDePlace = nombreDePlace;
		this.kilometrage = kilometrage;
		this.nombreDePorte = nombreDePorte;
		this.agence = agence;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	/**
	 * @return the nomVehicule
	 */
	public String getNomVehicule() {
		return nomVehicule;
	}

	/**
	 * @param nomVehicule
	 *            the nomVehicule to set
	 */
	public void setNomVehicule(String nomVehicule) {
		this.nomVehicule = nomVehicule;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur
	 *            the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the carburant
	 */
	public String getCarburant() {
		return carburant;
	}

	/**
	 * @param carburant
	 *            the carburant to set
	 */
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	/**
	 * @return the nombreDePlace
	 */
	public Integer getNombreDePlace() {
		return nombreDePlace;
	}

	/**
	 * @param nombreDePlace
	 *            the nombreDePlace to set
	 */
	public void setNombreDePlace(Integer nombreDePlace) {
		this.nombreDePlace = nombreDePlace;
	}

	/**
	 * @return the kilometrage
	 */
	public Double getKilometrage() {
		return kilometrage;
	}

	/**
	 * @param kilometrage
	 *            the kilometrage to set
	 */
	public void setKilometrage(Double kilometrage) {
		this.kilometrage = kilometrage;
	}

	/**
	 * @return the nombreDePorte
	 */
	public Integer getNombreDePorte() {
		return nombreDePorte;
	}

	/**
	 * @param nombreDePorte
	 *            the nombreDePorte to set
	 */
	public void setNombreDePorte(Integer nombreDePorte) {
		this.nombreDePorte = nombreDePorte;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImmatricule() {
		return immatricule;
	}

	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}

	public String getBoiteVitesse() {
		return boiteVitesse;
	}

	public void setBoiteVitesse(String boiteVitesse) {
		this.boiteVitesse = boiteVitesse;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public CompteAdmin getCompteadmin() {
		return compteadmin;
	}

	public void setCompteadmin(CompteAdmin compteadmin) {
		this.compteadmin = compteadmin;
	}

	public Collection<Service> getService() {
		return service;
	}

	public void setService(Collection<Service> service) {
		this.service = service;
	}

}
