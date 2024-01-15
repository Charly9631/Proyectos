package com.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderservice.entity.Pedido;
import com.orderservice.repository.PedidoRepository;
import com.productoservice.repository.ProductoRepository;

@Service
public class PedidoService {

	private final PedidoRepository pedidoRepository;
    private final ProductoRepository productoRepository;
	
    @Autowired
    public PedidoService(PedidoRepository pedidoRepository, ProductoRepository productoRepository) {
        this.pedidoRepository = pedidoRepository;
        this.productoRepository = productoRepository;
    }
    
    public void agregarPedido(Pedido pedido) {
    	pedidoRepository.agregarPedido(pedido);
    }
    
    public List<Pedido> obtenerTodosLosPedidos(){
    	return pedidoRepository.obtenerPedidos();
    }
}
