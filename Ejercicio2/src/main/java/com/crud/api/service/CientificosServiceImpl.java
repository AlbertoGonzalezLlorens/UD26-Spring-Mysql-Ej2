package com.crud.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.api.dao.ICientificosDAO;
import com.crud.api.dto.Cientificos;


@Service
public class CientificosServiceImpl implements ICientificosService{
	
	//Utilizamos los metodos de la interface IRolDAO, es como si instaciaramos.
	@Autowired
	ICientificosDAO iCientificosDAO;

	@Override
	public List<Cientificos> listarCientificos() {
		
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos guardarCientificos(Cientificos cientificos) {
		
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public Cientificos cientificosXID(String dni) {
		
		return iCientificosDAO.findById(dni).get();
	}

	@Override
	public Cientificos actualizarCientificos(Cientificos cientifico) {
		
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public void eliminarCientificos(String id) {
		
		iCientificosDAO.deleteById(id);
		
	}

}