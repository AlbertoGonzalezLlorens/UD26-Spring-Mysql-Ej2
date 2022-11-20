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
import com.crud.api.dto.AsignadoA;
import com.crud.api.service.AsignadoAServiceImpl;


@RestController
@RequestMapping("/api")

public class AsignadoAController {

	
	@Autowired
	AsignadoAServiceImpl AsignadoAServiceImpl;
	
	@GetMapping("/asignados")
	public List<AsignadoA> listarAsignadoA(){
		return AsignadoAServiceImpl.listarAsignado();
	}
	
	@PostMapping("/asignados")
	public AsignadoA salvarAsignadoA(@RequestBody AsignadoA asignado) {
		
		return AsignadoAServiceImpl.guardarAsignadoA(asignado);
	}
	
	@GetMapping("/asignados/{id}")
	public AsignadoA asignadoXID(@PathVariable(name="id") int id) {
		
		AsignadoA asignado_xid= new AsignadoA();
		
		asignado_xid=AsignadoAServiceImpl.asignadoXID(id);
		
		System.out.println("Asignado XID: "+asignado_xid);
		
		return asignado_xid;
	}
	
	@PutMapping("/asignados/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")int id,@RequestBody AsignadoA asignado) {
		
		AsignadoA asignado_seleccionado= new AsignadoA();
		AsignadoA asignado_actualizado= new AsignadoA();
		
		asignado_seleccionado= AsignadoAServiceImpl.asignadoXID(id);
		asignado_seleccionado.setCientifico(asignado.getCientifico());
		asignado_seleccionado.setProyecto(asignado.getProyecto());

		asignado_actualizado = AsignadoAServiceImpl.actualizarAsignadoA(asignado_seleccionado);
		
		System.out.println("El usuario actualizado es: "+ asignado_actualizado);
		
		return asignado_actualizado;
	}
	
	@DeleteMapping("/asignado/{id}")
	public void eleiminarAsignadoA(@PathVariable(name="id")int id) {
		AsignadoAServiceImpl.eliminarAsignadoA(id);
	}
	
	
}