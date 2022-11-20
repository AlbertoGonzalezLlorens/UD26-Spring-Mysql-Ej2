package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Cientificos;

public interface ICientificosService {
	
	//Metodos del CRUD
	public List<Cientificos> listarCientificos(); //Listar All 
	
	public Cientificos guardarCientificos(Cientificos cientifico);	//Guarda un Rol CREATE
	
	public Cientificos cientificosXID(String dni); //Leer datos de un Rol READ
	
	public Cientificos actualizarCientificos(Cientificos cientifico); //Actualiza datos del Rol UPDATE
	
	public void eliminarCientificos(String cientifico);// Elimina el Rol DELETE

}
