package com.servicio.rest.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.rest.modelo.Clientes;
import com.servicio.rest.repositorio.ClientesRepositorio;

@Service
public class ClienteServicio {

	@Autowired
	private ClientesRepositorio repositorio;
	
	public List<Clientes> listaClientes(){
		
		return repositorio.findAll();
	}
	
	public Optional<Clientes> findById(int id) {
		return repositorio.findById(id);
	}
	
	
}
