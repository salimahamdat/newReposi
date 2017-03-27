package org.sympanux.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class WebMaster implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 70)
	private String nomMaster;
	private String prenomMaster;
	private String email;
	private String tel;

	@OneToMany(mappedBy = "webmaster", fetch = FetchType.LAZY)
	private Collection<CompteAdmin> compteAdmin;

	public WebMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebMaster(String nomMaster, String prenomMaster, String email, String tel) {
		super();
		this.nomMaster = nomMaster;
		this.prenomMaster = prenomMaster;
		this.email = email;
		this.tel = tel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomMaster() {
		return nomMaster;
	}

	public void setNomMaster(String nomMaster) {
		this.nomMaster = nomMaster;
	}

	public String getPrenomMaster() {
		return prenomMaster;
	}

	public void setPrenomMaster(String prenomMaster) {
		this.prenomMaster = prenomMaster;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
