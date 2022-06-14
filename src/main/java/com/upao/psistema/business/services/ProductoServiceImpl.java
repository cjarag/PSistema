package com.upao.psistema.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upao.psistema.business.entities.Producto;
import com.upao.psistema.business.repositories.ProductoJpaRepository;


@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoJpaRepository productoRepository;
	
	@Override
	public List<Producto> ListarProductosActivos() {
		// Aplicamos la lógica del negocio
		return productoRepository.findAll();
	}

}
