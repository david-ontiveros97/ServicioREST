package com.servicio.rest.Assambler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.servicio.rest.entity.Clientes;
import com.servicio.rest.modelo.ClientesModel;

@Component
public class ClientesAssamblerimpl implements ClientesAssambler{

	

	public ClientesModel toModel(Clientes entity) {
		ClientesModel model = new ClientesModel();
		model.setNombre(entity.getNombre());
		model.setApellido(entity.getApellido());
		model.setVentas(entity.getVentas().stream().collect(Collectors.toList()));
		return model;
	}

	public List<ClientesModel> toModelList(List<Clientes> entities) {
		List<ClientesModel> models = new ArrayList<>();
		for (Clientes entity : entities) {
			models.add(toModel(entity));
		}
		return models;
	}

	public Optional<ClientesModel> toModelOptional(Optional<Clientes> entities) {
		ClientesModel model = new ClientesModel();
		return entities.map(entity -> {
			model.setNombre(entity.getNombre());
			model.setApellido(entity.getApellido());
			model.setVentas(entity.getVentas().stream().collect(Collectors.toList()));
			return model;
		});
	}
}
