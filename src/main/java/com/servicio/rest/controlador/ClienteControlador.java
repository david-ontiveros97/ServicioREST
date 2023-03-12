package com.servicio.rest.controlador;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.rest.modelo.Clientes;
import com.servicio.rest.servicio.ClienteServicio;

@RestController
public class ClienteControlador {
	
	@Autowired
	private ClienteServicio servicio;
	
	private static final Log LOG = LogFactory.getLog(ClienteControlador.class);

	@GetMapping("/clientes")
	public List<Clientes> listarClientes(){
		LOG.info("Prueba log");
		return servicio.listaClientes();
		
	}
	

}
