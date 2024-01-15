package com.orderservice.repository;

import java.util.List;

import com.orderservice.entity.Pedido;

public interface PedidoRepository {
public void agregarPedido(Pedido pedido);
public List<Pedido> obtenerPedidos();
}
