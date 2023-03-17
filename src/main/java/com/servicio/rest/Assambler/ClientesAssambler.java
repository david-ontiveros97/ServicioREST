package com.servicio.rest.Assambler;

import java.util.List;
import java.util.Optional;

import com.servicio.rest.entity.Clientes;
import com.servicio.rest.modelo.ClientesModel;

public interface ClientesAssambler {

	public ClientesModel toModel(Clientes entity);

	public List<ClientesModel> toModelList(List<Clientes> entities);

	public Optional<ClientesModel> toModelOptional(Optional<Clientes> entities);
}
