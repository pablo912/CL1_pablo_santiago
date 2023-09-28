package org.cibertec.edu.pe.interfaceServices;
import java.util.List;
import org.cibertec.edu.pe.modelos.Producto;


public interface IProductoService {
	
	public List<Producto> Listado();
	public int Grabar(Producto ObjC);

	
}
