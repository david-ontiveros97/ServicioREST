package com.servicio.rest.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "Productos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Productos {

	@Id
	@Column(name = "ID_producto")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Precio")
	private Double precio;
	
	
	@OneToMany(mappedBy = "productos", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Ventas> venta ;
	
	public Productos() {
		
	}
	
	public Productos(Integer id, String nombre, Double precio, List<Ventas> venta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.venta = venta;
	}
	public Productos( String nombre, Double precio, List<Ventas> venta) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.venta = venta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public List<Ventas> getVenta() {
		return venta;
	}

	public void setVenta(List<Ventas> venta) {
		this.venta = venta;
	}
	@Override
	public String toString() {
		return "Productos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", venta=" + venta + "]";
	}
	
	
}
