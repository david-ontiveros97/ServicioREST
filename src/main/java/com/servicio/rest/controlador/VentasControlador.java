package com.servicio.rest.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.rest.entity.Ventas;
import com.servicio.rest.servicio.VentasServicioimpl;

@RestController
public class VentasControlador {

	@Autowired
	private VentasServicioimpl ventasServicio;
	
	@GetMapping("/ventas")
	public ResponseEntity<List<Ventas>> consultarVentas(){
		List<Ventas> ventas = ventasServicio.listarVentas();
		return ResponseEntity.ok(ventas);
	}

}
