package com.servicio.rest.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.rest.modelo.VentasModel;
import com.servicio.rest.servicio.VentasServicio;

@RestController
public class VentasControlador {

	@Autowired
	private VentasServicio ventasServicio;
	
	
	
	@GetMapping("/ventas")
	public ResponseEntity<List<VentasModel>> consultarVentas(){
		List<VentasModel> ventas = ventasServicio.listarVentas();
		return ResponseEntity.ok(ventas);
	}
	@GetMapping("/ventas/csv")
	public void exportToCsv(HttpServletResponse response) throws IOException {
		
		response.setContentType("txt/csv");
		response.setHeader("Content-Disposition","attachment; filename=\"ventas.csv\"" );
		
		List<VentasModel> ventas = ventasServicio.listarVentas();
		
		PrintWriter writer = response.getWriter();
		writer.println("Fecha,cantidad,clientes,producto");
		for(VentasModel venta : ventas) {
			writer.println(String.format("%s,%d,%s", venta.getFecha(),venta.getCantidad(), venta.getClientes(), venta.getProductos()));
			
		}
		writer.close();
	}

}
