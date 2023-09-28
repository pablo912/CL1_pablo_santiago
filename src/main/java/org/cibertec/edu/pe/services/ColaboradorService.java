package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.interfaceServices.IProductoService;
import org.cibertec.edu.pe.interfaces.IProducto;
import org.cibertec.edu.pe.modelos.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorService implements IProductoService {
	
	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> Listado() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public int Grabar(Producto ObjC) {
		int rpta = 0;
		Producto p = data.save(ObjC);
		if(!p.equals(null))rpta = 1;
		return rpta;
	}

}
