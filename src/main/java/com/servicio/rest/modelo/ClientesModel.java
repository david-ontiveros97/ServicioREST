package com.servicio.rest.modelo;

import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.servicio.rest.entity.Ventas;

@Component
public class ClientesModel {

	@JsonProperty("Nombre")
	private String nombre;
	@JsonProperty("apellido")
	private String apellido;

	@JsonBackReference
	private List<Ventas> ventas;

	public String getNombre() {
		return nombre;
	}

	public ClientesModel(String nombre, String apellido, List<Ventas> ventas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ventas = ventas;
	}
	
	public ClientesModel() {
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Ventas> getVentas() {
		return ventas;
	}

	public void setVentas(List<Ventas> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "ClientesModel [nombre=" + nombre + ", apellido=" + apellido + ", ventas=" + ventas + "]";
	}

}
