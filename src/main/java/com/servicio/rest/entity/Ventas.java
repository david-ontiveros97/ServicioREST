package com.servicio.rest.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Ventas")
public class Ventas {

	@Id
	@Column(name = "ID_venta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "Fecha")
	private LocalDate fecha;
	@Column(name = "Cantidad")
	private int cantidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_producto")
	private Productos productos;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_cliente")
	private Clientes clientes;

	public Ventas() {
		
	}
	
	public Ventas(Integer id, LocalDate fecha, int cantidad, Productos producto, Clientes cliente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.productos = producto;
		this.clientes = cliente;
	}

	public Ventas(LocalDate fecha, int cantidad, Productos producto, Clientes cliente) {
		super();
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.productos = producto;
		this.clientes = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Productos getProducto() {
		return productos;
	}

	public void setProducto(Productos producto) {
		this.productos = producto;
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
		return "Ventas [id=" + id + ", fecha=" + fecha + ", cantidad=" + cantidad + "]";
	}

	

	

}
