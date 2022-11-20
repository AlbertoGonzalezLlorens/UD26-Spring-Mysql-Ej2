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
@Table(name="proyecto")
public class Proyectos {

	//Atributos de entidad cliente
	@Id
	private String id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "horas")
	private int horas;

	
    @OneToMany
    @JoinColumn(name="proyecto")
    private List<AsignadoA> asignado;
	
	//Constructores
	
	public Proyectos() {
	
	}

	public Proyectos(String id, String nombre, int horas) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;

	}

	
	//Getters y Setters
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proyecto")
	public List<AsignadoA> getAsignado() {
		return asignado;
	}

	public void setAsignado(List<AsignadoA> asignado) {
		this.asignado = asignado;
	}

	//Metodo impresion de datos por consola
	
	@Override
	public String toString() {
		return "Proyectos [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}


	
	
}