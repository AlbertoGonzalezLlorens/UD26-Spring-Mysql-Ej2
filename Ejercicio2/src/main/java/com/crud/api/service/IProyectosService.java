package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.Proyectos;

public interface IProyectosService {
	
		//Metodos del CRUD
		public List<Proyectos> listarProyectos(); //Listar All 
		
		public Proyectos guardarProyectos(Proyectos proyecto);	//Guarda un Usuario CREATE
		
		public Proyectos proyectoXID(String id); //Leer datos de un Usuario READ
		
		public Proyectos actualizarProyectos(Proyectos proyecto); //Actualiza datos del Usuario UPDATE
		
		public void eliminarProyectos(String id);// Elimina el Usuario DELETE

}
