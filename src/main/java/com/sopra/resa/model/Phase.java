package com.sopra.resa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Embeddable
public class Phase implements Serializable{
	
	@Override
	public String toString() {
		return "Phase [localite=" + localite + ", date=" + date + "]";
	}
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="refLocalite")//sera redefini refLocDepart ou refLocArrivee
	private Localite localite;
	
	@Temporal(TemporalType.DATE)
	@Column(name="datePhase")//sera redefini dateDepart ou dateArrivee
	private Date date;
	//...
	public Phase() {
		super();
	}
	public Phase(Localite localite, Date date) {
		super();
		this.localite = localite;
		this.date = date;
	}
	
	public Localite getLocalite() {
		return localite;
	}
	
	public void setLocalite(Localite localite) {
		this.localite = localite;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
