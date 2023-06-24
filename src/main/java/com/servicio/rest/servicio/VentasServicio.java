package com.servicio.rest.servicio;

import java.util.List;

import com.servicio.rest.entity.Ventas;
import com.servicio.rest.modelo.VentasModel;

public interface VentasServicio {
	
	public List<VentasModel> listarVentas();

}
