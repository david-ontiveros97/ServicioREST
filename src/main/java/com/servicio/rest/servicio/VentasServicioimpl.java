package com.servicio.rest.servicio;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.rest.Assambler.VentasAssambler;
import com.servicio.rest.entity.Ventas;
import com.servicio.rest.modelo.VentasModel;
import com.servicio.rest.repositorio.VentasRepositorio;

@Service
public class VentasServicioimpl implements VentasServicio {

	@Autowired
	private VentasRepositorio ventasRepositorio;
	
	@Autowired
	private VentasAssambler ventasAssambler;
	
	private static final Log LOG = LogFactory.getLog(VentasServicioimpl.class);
	
	public List<VentasModel> listarVentas(){
		List<Ventas> ventas = ventasRepositorio.findAll();
		return ventasAssambler.toModelList(ventas);
	}
}
