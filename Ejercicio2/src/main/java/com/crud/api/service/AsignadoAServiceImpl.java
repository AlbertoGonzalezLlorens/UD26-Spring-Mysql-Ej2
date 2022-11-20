package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.IAsignadoADAO;
import com.crud.api.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl implements IAsignadoAService{
	
	//Utilizamos los metodos de la interface IUsuarioDAO, es como si instaciaramos.
	@Autowired
	IAsignadoADAO iAsignadoADAO;

	@Override
	public List<AsignadoA> listarAsignado() {
		
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignado) {
		
		return iAsignadoADAO.save(asignado);
	}

	@Override
	public AsignadoA asignadoXID(int id) {
		
		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignado) {
		
		return iAsignadoADAO.save(asignado);
	}

	@Override
	public void eliminarAsignadoA(int id) {
		
		iAsignadoADAO.deleteById(id);
		
	}

}