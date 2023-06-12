package org.openbootcamp.ejercicio4;

public class Ejercicio {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Motorola", "Moto Edge 30", "Android 12", 6, 8);
        SmartWatch smartWatch = new SmartWatch("Motorola","Moto 360","Androird Wear",2,2);

        System.out.println("\nSmartPhone:");
        System.out.println("Marca: " + smartPhone.marca);
        System.out.println("Modelo: " + smartPhone.modelo);
        System.out.println("Sistema Operativo: " + smartPhone.sistemaOperativo);
        System.out.println("Tamaño de pantalla: " + smartPhone.tamPantalla);
        System.out.println("Cantidad de RAM: " + smartPhone.cantidadRam);

        System.out.println("\nSmartWatch:");
        System.out.println("Marca: " + smartWatch.marca);
        System.out.println("Modelo: " + smartWatch.modelo);
        System.out.println("Sistema Operativo: " + smartWatch.sistemaOperativo);
        System.out.println("Tamaño de pantalla: " + smartWatch.tamPantalla);
        System.out.println("Cantidad de RAM: " + smartWatch.cantidadRam);
    }
}
