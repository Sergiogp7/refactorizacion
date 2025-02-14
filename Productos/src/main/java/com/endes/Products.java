package com.endes;

public class Products {
	public String nombre;
	public double precio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Products [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
}
