package com.orderservice.repository;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.entity.Alumno;
import com.orderservice.entity.Pedido;
import com.productoservice.repository.ProductoRepository;

public class PedidoRepositoryImpl implements PedidoRepository {

	private List<Pedido> pedidos = new ArrayList<>();
	
	@Override
	public void agregarPedido(Pedido pedido) {
		String sql = "INSERT INTO PEDIDOS VALUES (?)";
		//Codigo necesario para ejecutar el query en la BDD
	}
	Pedido a = null;
	@Override
	public List<Pedido> obtenerPedidos() {
		String query ="SELECT * FROM PEDIDOS";
		List<Pedido> pedidos = new ArrayList<Pedido>();
		//Codigo necesario para ejecutar el query en la BDD
		return pedidos;
	}

}
