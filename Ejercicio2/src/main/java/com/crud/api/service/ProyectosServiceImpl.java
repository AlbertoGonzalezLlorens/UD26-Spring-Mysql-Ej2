package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IProyectosDAO;
import com.crud.api.dto.Proyectos;

@Service
public class ProyectosServiceImpl implements IProyectosService{
	
	//Utilizamos los metodos de la interface IUsuarioDAO, es como si instaciaramos.
	@Autowired
	IProyectosDAO iProyectosDAO;

	@Override
	public List<Proyectos> listarProyectos() {
		
		return iProyectosDAO.findAll();
	}

	@Override
	public Proyectos guardarProyectos(Proyectos proyecto) {
		
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public Proyectos proyectoXID(String id) {
		
		return iProyectosDAO.findById(id).get();
	}

	@Override
	public Proyectos actualizarProyectos(Proyectos proyecto) {
		
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public void eliminarProyectos(String id) {
		
		iProyectosDAO.deleteById(id);
		
	}

}