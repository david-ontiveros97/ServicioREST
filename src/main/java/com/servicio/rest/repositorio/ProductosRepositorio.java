package com.servicio.rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.rest.modelo.Productos;

public interface ProductosRepositorio extends JpaRepository<Productos, Integer>{

}
