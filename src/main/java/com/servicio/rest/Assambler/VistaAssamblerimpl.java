package com.servicio.rest.Assambler;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.servicio.rest.entity.Ventas;
import com.servicio.rest.modelo.VentasModel;

@Component
public class VistaAssamblerimpl implements VentasAssambler {

	
	private static final Log LOG = LogFactory.getLog(VistaAssamblerimpl.class);

	public VentasModel toModel(Ventas entity) {
		VentasModel model = new VentasModel();
		model.setCantidad(entity.getCantidad());
		model.setFecha(entity.getFecha());
		model.setClientes(entity.getClientes());
		model.setProductos(entity.getProducto());
		return model;
	}

	public List<VentasModel> toModelList(List<Ventas> entities) {
		List<VentasModel> models = new ArrayList<>();
		LOG.info(entities.toString());
		for (Ventas entity : entities) {
			models.add(toModel(entity));
			LOG.info("XDDDD");
			LOG.info("IMPRESION MODELTOLIST : " +   toModel(entity).toString());
		}
		return models;
	}

}
