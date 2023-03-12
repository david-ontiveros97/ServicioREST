package com.servicio.rest.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Clientes {

	@Id
	@Column(name = "ID_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Apellido")
	private String apellido;

	public Clientes(Integer id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Clientes(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Clientes() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public String getNombre() {
		return nombre;
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
}
