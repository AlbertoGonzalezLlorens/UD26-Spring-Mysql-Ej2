package com.crud.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.api.dto.Cientificos;
import com.crud.api.service.CientificosServiceImpl;


@RestController
@RequestMapping("/api")

public class CientificosController {

	
	@Autowired
	CientificosServiceImpl CientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return CientificosServiceImpl.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientificos salvarCientificos(@RequestBody Cientificos cientifico) {
		
		return CientificosServiceImpl.guardarCientificos(cientifico);
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientificos cientificoXID(@PathVariable(name="dni") String dni) {
		
		Cientificos cientifico_xid= new Cientificos();
		
		cientifico_xid=CientificosServiceImpl.cientificosXID(dni);
		
		System.out.println("Cientifico XID: "+cientifico_xid);
		
		return cientifico_xid;
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientificos actualizarCientificos(@PathVariable(name="dni")String dni,@RequestBody Cientificos cientifico) {
		
		Cientificos cientifico_seleccionado= new Cientificos();
		Cientificos cientifico_actualizado= new Cientificos();
		
		cientifico_seleccionado= CientificosServiceImpl.cientificosXID(dni);
		cientifico_seleccionado.setNomapels(cientifico.getNomapels());

		cientifico_actualizado = CientificosServiceImpl.actualizarCientificos(cientifico_seleccionado);
		
		System.out.println("El cientifico actualizado es: "+ cientifico_actualizado);
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eleiminarRol(@PathVariable(name="dni")String dni) {
		CientificosServiceImpl.eliminarCientificos(dni);
	}
	
	
}

