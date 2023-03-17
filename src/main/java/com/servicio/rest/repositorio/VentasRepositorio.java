package com.servicio.rest.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.rest.entity.Ventas;

public interface VentasRepositorio extends JpaRepository<Ventas, Integer>{
	List<Ventas> findAll();
}
