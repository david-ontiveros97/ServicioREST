package com.servicio.rest.servicio;

import java.util.List;

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
	
	
}
