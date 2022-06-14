package com.upao.psistema.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.upao.psistema.business.services.ProductoService;

@Controller
public class ProductoController {
	
	protected final Log logger=LogFactory.getLog(getClass());
	
	@Autowired
	private ProductoService productoService;
		
	@RequestMapping(value = "/productos.htm")
	public ModelAndView ListadorProductos() {
		
		//enviar los datos de los productos hacia la vista
		Map<String,Object> productoModel=new HashMap<String, Object>();
		
		productoModel.put("productos", this.productoService.ListarProductosActivos());		
		logger.info("Resolviendo la lista de productos.");
		logger.info(productoModel);
		//devolver a la vista
		return new ModelAndView("lstproductos","model",productoModel);
		//return new ModelAndView("lstproductos");
	}

}
