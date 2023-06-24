package com.servicio.rest.Assambler;

import java.util.List;

import com.servicio.rest.entity.Ventas;
import com.servicio.rest.modelo.VentasModel;

public interface VentasAssambler {

	public VentasModel toModel(Ventas entity);

	public List<VentasModel> toModelList(List<Ventas> entities);

}
