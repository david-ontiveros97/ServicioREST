package com.servicio.rest.controlador;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.rest.modelo.ClientesModel;
import com.servicio.rest.servicio.ClienteServicio;

@RestController
public class ClienteControlador {

	@Autowired
	private ClienteServicio servicio;

	private static final Log LOG = LogFactory.getLog(ClienteControlador.class);

	@GetMapping("/clientes")
	public ResponseEntity<List<ClientesModel>> consultarClientes() {
		List<ClientesModel> clientes = servicio.listaClientes();
		return ResponseEntity.ok(clientes);

	}
/*
 * Buscar clientes por ID_CLIENTE
 * @param clienteID -
 * @author david-ontiveros97
 */
	@GetMapping("/clientes/{id}")
	public ResponseEntity<ClientesModel> buscarClientePorId(@PathVariable(value = "id") int clienteId) {
		Optional<ClientesModel> cliente = servicio.findById(clienteId);
		if (cliente.isPresent()) {
			return ResponseEntity.ok().body(cliente.get());
		} else {
			LOG.error("Error en el controlador cliente" + ResponseEntity.notFound().build() );
			return ResponseEntity.notFound().build();
		}
	}

}
