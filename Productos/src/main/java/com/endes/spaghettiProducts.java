package com.endes;

public class spaghettiProducts {
    private String[] productNames = new String[3];
    private double[] productPrices = new double[3];
    int productCount = 0;

    public void addProduct(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Nombre inválido");
            return;
        }
        if (price < 0) {
            System.out.println("Error: Precio negativo");
            return;
        }
        try {
            if (productCount < productNames.length) {
                productNames[productCount] = name;
                productPrices[productCount] = price;
                productCount++;
                System.out.println("Producto agregado: " + name);
            } else {
                System.out.println("Límite de array alcanzado. Convirtiendo a lista...");
                java.util.List namesList = new java.util.ArrayList<>();
                java.util.List pricesList = new java.util.ArrayList<>();
                for (int i = 0; i < productCount; i++) {
                    namesList.add(productNames[i]);
                    pricesList.add(productPrices[i]);
                }
                namesList.add(name);
                pricesList.add(price);
                productNames = new String[namesList.size()];
                productPrices = new double[pricesList.size()];
                for (int i = 0; i < namesList.size(); i++) {
                    productNames[i] = (String) namesList.get(i);
                    productPrices[i] = (double) pricesList.get(i);
                }
                productCount = namesList.size();
                System.out.println("Producto agregado después de conversión: " + name);
            }
        } catch (Exception e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }

    public void listProducts() {
        try {
            if (productCount == 0) {
                throw new Exception("No hay productos para listar.");
            }
            for (int i = 0; i < productCount; i++) {
                System.out.println("Producto " + (i + 1) + ": " + productNames[i] + " - Precio: " + productPrices[i]);
            }
        } catch (Exception e) {
            System.out.println("Error en listProducts: " + e.getMessage());
        }
    }

    public void findProduct(String searchName) {
        boolean found = false;
        for (int i = 0; i < productCount; i++) {
            if (productNames[i].equalsIgnoreCase(searchName)) {
                System.out.println("Producto encontrado: " + productNames[i] + " - Precio: " + productPrices[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            try {
                throw new Exception("Producto no encontrado: " + searchName);
            } catch (Exception e) {
                System.out.println("Error en findProduct: " + e.getMessage());
            }
        }
    }

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
