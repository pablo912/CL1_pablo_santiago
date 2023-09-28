package org.cibertec.edu.pe.controllers;

import java.util.List;

import javax.validation.Valid;

import org.cibertec.edu.pe.interfaceServices.IProductoService;
import org.cibertec.edu.pe.modelos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping
public class ProductoCotroller {
	
	
	@Autowired
	private IProductoService servicio;
	
	@GetMapping("/listar")		// http://localhost:8080/listar
	public String Listar(Model m) {
		List<Producto> lista = servicio.Listado();
		m.addAttribute("productos", lista);
		return "listar";		// listar.html
	}
	

	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("producto", new Producto());
		return "new";			// form.html
	}
	

	@PostMapping("/nuevo")
	public String salvar(@Valid @ModelAttribute("producto") Producto producto, BindingResult result) {
		
		if (result.hasErrors()) {
	         return "new";
	    }
		
		servicio.Grabar(producto);
		return "redirect:/listar";
		
	}
}
