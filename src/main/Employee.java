package main;

public class Employee {
	String nombre;
	int años;
	public Employee(String nombre, int años) {
		this.nombre = nombre;
		this.años = años;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getAños() {
		return años;
	}



	public void setAños(int años) {
		this.años = años;
	}



	@Override
	public String toString() {
		return "Employee [nombre=" + nombre + ", años=" + años + "]";
	}
	
}
