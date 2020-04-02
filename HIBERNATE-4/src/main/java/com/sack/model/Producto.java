package com.sack.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the productos database table.
 * 
 */
@Entity
@Table(name="productos")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="cantidad_producto")
	private int cantidadProducto;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name="nombre_productos")
	private String nombreProductos;

	@Override
	public String toString() {
		return "Producto [id=" + id + ", cantidadProducto=" + cantidadProducto + ", nombreProductos=" + nombreProductos
				+ ", precioProducto=" + precioProducto + ", totalProducto=" + totalProducto + "]";
	}

	@Column(name="precio_producto")
	private double precioProducto;

	@Column(name="total_producto")
	private double totalProducto;

	public Producto() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadProducto() {
		return this.cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getNombreProductos() {
		return this.nombreProductos;
	}

	public void setNombreProductos(String nombreProductos) {
		this.nombreProductos = nombreProductos;
	}

	public double getPrecioProducto() {
		return this.precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getTotalProducto() {
		return this.totalProducto;
	}

	public void setTotalProducto(double totalProducto) {
		this.totalProducto = totalProducto;
	}

}