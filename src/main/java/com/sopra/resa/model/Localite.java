package com.sopra.resa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Localite")
public class Localite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String ville;
	private String aeroport;
	
	
	public Localite() {
		super();
	}
	
	
	
	
	public Localite(Long id, String ville, String aeroport) {
		super();
		this.id = id;
		this.ville = ville;
		this.aeroport = aeroport;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAeroport() {
		return aeroport;
	}
	public void setAeroport(String aeroport) {
		this.aeroport = aeroport;
	}




	@Override
	public String toString() {
		return "Localite [id=" + id + ", ville=" + ville + ", aeroport=" + aeroport + "]";
	}
	
	
	
}
