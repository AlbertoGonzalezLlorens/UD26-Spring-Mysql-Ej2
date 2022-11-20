package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Proyectos;

public interface IProyectosDAO extends JpaRepository<Proyectos, String>{

}
