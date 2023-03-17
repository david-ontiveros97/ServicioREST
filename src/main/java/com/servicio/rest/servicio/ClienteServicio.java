package com.servicio.rest.servicio;

import java.util.List;
import java.util.Optional;

import com.servicio.rest.entity.Clientes;
import com.servicio.rest.modelo.ClientesModel;

public interface ClienteServicio {
	public List<ClientesModel>  listaClientes();
	public Optional<ClientesModel> findById(int id); 

}
