package org.sympanux.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Service implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 70)
	private String nomService;

	@ManyToMany
	@JoinColumn(name = "ID_Vehic")
	private Collection<Vehicule> vehicule;

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Service(String nomService) {
		super();
		this.nomService = nomService;
	}

	public String getNomService() {
		return nomService;
	}

	public void setNomService(String nomService) {
		this.nomService = nomService;
	}

}
