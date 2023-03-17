package com.servicio.rest.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.rest.Assambler.ClientesAssambler;
import com.servicio.rest.entity.Clientes;
import com.servicio.rest.modelo.ClientesModel;
import com.servicio.rest.repositorio.ClientesRepositorio;

@Service
public class ClienteServicioimpl implements ClienteServicio{

	@Autowired
	private ClientesRepositorio clientesRepositorio;
	
	@Autowired
	private ClientesAssambler clientesAssembler;
	
	public List<ClientesModel>  listaClientes(){
		List<Clientes> clientes = clientesRepositorio.findAll(); 
		return  clientesAssembler.toModelList(clientes);
	}
	
	public Optional<ClientesModel> findById(int id) {
		Optional<Clientes> clientes = clientesRepositorio.findById(id);
		
		return clientesAssembler.toModelOptional(clientes);
	}
	
	
}
