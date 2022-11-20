package com.crud.api.service;

import java.util.List;

import com.crud.api.dto.AsignadoA;

public interface IAsignadoAService {
	
		//Metodos del CRUD
		public List<AsignadoA> listarAsignado(); //Listar All 
		
		public AsignadoA guardarAsignadoA(AsignadoA asignado);	
		
		public AsignadoA asignadoXID(int id); //Leer datos de un Usuario READ
		
		public AsignadoA actualizarAsignadoA(AsignadoA asignado); //Actualiza datos del Usuario UPDATE
		
		public void eliminarAsignadoA(int id);// Elimina el Usuario DELETE

}
