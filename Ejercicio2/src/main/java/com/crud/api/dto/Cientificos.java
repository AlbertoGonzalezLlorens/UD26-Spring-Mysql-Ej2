package com.crud.api.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.crud.api.dto.AsignadoA;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientificos")
public class Cientificos {

	//Atributos de entidad cliente
	@Id
	private String dni;
	@Column(name = "nomapels")//no hace falta si se llama igual
	private String nomapels;

	
    @OneToMany
    @JoinColumn(name="cientifico")
    private List<AsignadoA> asignado;
	
	//Constructores
	
	public Cientificos() {
	
	}


	public Cientificos(String dni, String nomapels) {
		//super();
		this.dni = dni;
		this.nomapels = nomapels;

	}

	
	//Getters y Setters
	
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNomapels() {
		return nomapels;
	}


	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}


	/**
	 * @return the usuario
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cientifico")
	public List<AsignadoA> getAsignado() {
		return asignado;
	}

	/**
	 * @param usuario the video to set
	 */
	public void setAsignadoo(List<AsignadoA> asignado) {
		this.asignado = asignado;
	}

	//Metodo impresion de datos por consola
	
	@Override
	public String toString() {
		return "Cientificos [dni=" + dni + ", nomapels=" + nomapels + "]";
	}

}