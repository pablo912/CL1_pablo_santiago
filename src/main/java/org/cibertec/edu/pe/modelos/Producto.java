package org.cibertec.edu.pe.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.*;


@Entity
@Table( name = "producto" )
public class Producto {

	 @Id
	 @Size(min = 6, max = 6, message = "El Id debe tener 6 caracteres")
	 
	 
	 private String idProducto;
	 
	 @Size(min = 1, max = 50, message = "La Descripcion debe tener entre 1 y 50 caracteres")
	 private String descripcion;
	 
	 @DecimalMin(value = "50.0", message = "El precio unitario debe ser mayor o igual a 50")
	 @DecimalMax(value = "500.0", message = "El precio unitario debe ser menor o igual a 500")
	 private double precioUnidad;
	 
	 @Min(value = 1, message = "El Stock debe ser mayor a cero")
	 private int stock;
	 
	 @Pattern(regexp = "[01]", message = "El Estado debe ser '0' o '1'")
	 private String estado;
	 
	
	 public Producto() {}
	 
	public Producto(String idProducto, String descripcion, double precioUnidad, int stock, String estado) {
	
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precioUnidad = precioUnidad;
		this.stock = stock;
		this.estado = estado;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	 
	 
}
