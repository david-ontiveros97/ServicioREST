package com.servicio.rest.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.rest.modelo.Clientes;


public interface ClientesRepositorio  extends JpaRepository<Clientes, Integer>{

	List<Clientes> findAll();
	
	 Optional<Clientes> findById(int id);
	
}
