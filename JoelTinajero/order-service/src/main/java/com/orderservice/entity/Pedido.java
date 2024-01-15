package com.orderservice.entity;

import java.io.Serializable;
import java.util.List;
import com.productoservice.entity.Producto;

import javax.persistence.Entity;


@Entity
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long idPedido;
	private String cliente;
	private List<Producto> productos;
	private double total;
	
	public Pedido() {
		
	}

	public Pedido(String cliente, List<Producto> productos) {
		super();

		this.cliente = cliente;
		this.productos = productos;
		calcularTotal();
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	 public double getTotal() {
	        return total;
	    }

	    // Método para calcular el total del pedido
	    private void calcularTotal() {
	        this.total = productos.stream().mapToDouble(Producto::getPrecio).sum();
	    }
	
	
}
