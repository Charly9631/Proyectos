package com.productoservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productoservice.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	
	
}