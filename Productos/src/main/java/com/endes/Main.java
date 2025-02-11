package com.endes;

public class Main {
	public static void main(String[] args) {
        spaghettiProducts sp = new spaghettiProducts();
        sp.addProduct("Monitor", 250);
        sp.addProduct("Teclado", 50);
        sp.addProduct("Mouse", 25);
        sp.addProduct("Impresora", 150); // Debería activar la conversión de arrays a listas
        sp.listProducts();
        sp.findProduct("Teclado");
        sp.findProduct("Scanner"); // Producto inexistente para provocar error
    }
}
