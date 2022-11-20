package com.crud.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.api.dto.Cientificos;

public interface ICientificosDAO extends JpaRepository<Cientificos, String>{

}
