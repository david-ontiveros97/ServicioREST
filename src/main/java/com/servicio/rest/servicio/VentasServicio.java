package com.servicio.rest.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.rest.modelo.Ventas;
import com.servicio.rest.repositorio.VentasRepositorio;

@Service
public class VentasServicio {

	@Autowired
	private VentasRepositorio ventasRepositorio;
	
	public List<Ventas> listarVentas(){
		return ventasRepositorio.findAll();
	}
}
