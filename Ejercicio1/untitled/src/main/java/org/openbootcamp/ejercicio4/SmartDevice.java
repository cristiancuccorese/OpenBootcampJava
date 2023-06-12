package org.openbootcamp.ejercicio4;

public class SmartDevice {
    String marca;
    String modelo;
    String sistemaOperativo;
    int tamPantalla;
    int cantidadRam;


    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String sistemaOperativo, int tamPantalla, int cantidadRam) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tamPantalla = tamPantalla;
        this.cantidadRam = cantidadRam;
    }


}



