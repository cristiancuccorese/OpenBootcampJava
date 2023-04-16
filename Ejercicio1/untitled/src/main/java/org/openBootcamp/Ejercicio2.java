package org.openBootcamp;

import java.util.Scanner;

public class Ejercicio2 {
    public static double calcularIva(double precio) {
        final double IVA_ARGENTINA = 21.0;
        return precio * (1 + IVA_ARGENTINA / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Precio: ");
        double precio = scanner.nextDouble();

        double precioConIva = calcularIva(precio);

        System.out.println("El precio con IVA en Argentina es: $" + precioConIva);
    }
}

