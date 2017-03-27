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

@Entity
public class CompteAdmin implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 70)
	private String nomAdmin;
	private String prenomAdmin;
	private String email;
	private String gsm;

	@OneToMany(mappedBy = "compteadmin", fetch = FetchType.LAZY)
	private Collection<Vehicule> vehicule;

	@OneToMany(mappedBy = "compteadmin", fetch = FetchType.LAZY)
	private Collection<Agence> agence;

	@ManyToOne
	@JoinColumn(name = "ID_Master")
	private WebMaster webmaster;

	public CompteAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteAdmin(String nomAdmin, String prenomAdmin, String email, String gsm) {
		super();
		this.nomAdmin = nomAdmin;
		this.prenomAdmin = prenomAdmin;
		this.email = email;
		this.gsm = gsm;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomAdmin() {
		return nomAdmin;
	}

	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}

	public String getPrenomAdmin() {
		return prenomAdmin;
	}

	public void setPrenomAdmin(String prenomAdmin) {
		this.prenomAdmin = prenomAdmin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGsm() {
		return gsm;
	}

	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public WebMaster getWebmaster() {
		return webmaster;
	}

	public void setWebmaster(WebMaster webmaster) {
		this.webmaster = webmaster;
	}

}
