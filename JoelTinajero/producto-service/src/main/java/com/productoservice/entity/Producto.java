package com.productoservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTO")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pid_auto")
	@SequenceGenerator(name="pid_auto", sequenceName="PRODUCTO_SEQ", allocationSize=1)
	@Column(name="ID_PRODUCTO", columnDefinition="NUMBER")
	private int idProducto;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(30)")
	private String nombre;
	
	@Column(name="PRECIO", columnDefinition="FLOAT")
	private double precio;
	
	public Producto() {
		
	}

	public Producto(int idProducto) {
		super();
		this.idProducto = idProducto;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
