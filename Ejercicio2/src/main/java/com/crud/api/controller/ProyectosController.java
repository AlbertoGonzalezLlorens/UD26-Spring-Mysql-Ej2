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
import com.crud.api.dto.Proyectos;
import com.crud.api.service.ProyectosServiceImpl;


@RestController
@RequestMapping("/api")

public class ProyectosController {

	
	@Autowired
	ProyectosServiceImpl ProyectosServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyectos> listarProyectos(){
		return ProyectosServiceImpl.listarProyectos();
	}
	
	@PostMapping("/proyectos")
	public Proyectos salvarProyectos(@RequestBody Proyectos proyecto) {
		
		return ProyectosServiceImpl.guardarProyectos(proyecto);
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyectos proyectoXID(@PathVariable(name="id") String id) {
		
		Proyectos proyecto_xid= new Proyectos();
		
		proyecto_xid=ProyectosServiceImpl.proyectoXID(id);
		
		System.out.println("Proyecto XID: "+proyecto_xid);
		
		return proyecto_xid;
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyectos actualizarProyectos(@PathVariable(name="id")String id,@RequestBody Proyectos proyecto) {
		
		Proyectos proyecto_seleccionado= new Proyectos();
		Proyectos proyecto_actualizado= new Proyectos();
		
		proyecto_seleccionado= ProyectosServiceImpl.proyectoXID(id);
		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());

		proyecto_actualizado = ProyectosServiceImpl.actualizarProyectos(proyecto_seleccionado);
		
		System.out.println("El proyecto actualizado es: "+ proyecto_actualizado);
		
		return proyecto_actualizado;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eleiminarProyectos(@PathVariable(name="id")String id) {
		ProyectosServiceImpl.eliminarProyectos(id);
	}
	
	
}