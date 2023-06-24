package com.servicio.rest.modelo;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.servicio.rest.entity.Clientes;
import com.servicio.rest.entity.Productos;

@Component
public class VentasModel {

	@JsonProperty("fecha")
	private LocalDate fecha;
	@JsonProperty("cantidad")
	private int cantidad;
	@JsonBackReference
	private Productos productos;
	@JsonIgnore
	private Clientes clientes;

	public VentasModel() {
	}

	public VentasModel(LocalDate fecha, int cantidad, Productos productos, Clientes clientes) {
		super();
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.productos = productos;
		this.clientes = clientes;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "VentasModel [fecha=" + fecha + ", cantidad=" + cantidad + ", productos=" + productos + ", clientes="
				+ clientes + "]";
	}

}
