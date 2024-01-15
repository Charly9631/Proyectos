package com.productoservice.request;

public class ProductoRequest {

	private int idProducto;
	private String nombre;
	private double precio;
	
	public ProductoRequest() {}

	public ProductoRequest(int idProducto, String nombre, double precio) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precio = precio;
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

	@Override
	public String toString() {
		return "ProductoRequest [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
