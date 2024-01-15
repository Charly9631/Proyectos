package com.productoservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productoservice.entity.Producto;
import com.productoservice.repository.ProductoRepository;
import com.productoservice.request.ProductoRequest;

@Service
public class ProductoService {

	private final ProductoRepository productoRepository;
	
	
	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	public List<Producto> mostrarTodos(){
		return productoRepository.findAll();
	}
	
	public Producto guardarProducto(Producto nuevoProducto) {
		return productoRepository.save(nuevoProducto);	
	}
	
	 public Producto actualizarProducto(int id, Producto productoActualizado) {
	        if (productoRepository.existsById(id)) {
	            productoActualizado.setIdProducto(id);
	            return productoRepository.save(productoActualizado);
	        } else {
	            return (Producto) productoRepository;
	        }
	    }
	 public void eliminarProducto(int id) {
	        productoRepository.deleteById(id);
	    }
}
