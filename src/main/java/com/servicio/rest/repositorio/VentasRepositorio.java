package com.servicio.rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.rest.modelo.Ventas;

public interface VentasRepositorio extends JpaRepository<Ventas, Integer>{

}
