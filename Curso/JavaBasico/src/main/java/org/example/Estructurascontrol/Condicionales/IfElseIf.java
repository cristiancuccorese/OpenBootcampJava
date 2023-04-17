package org.example.Estructurascontrol.Condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "Sabado";

        //ejemplos comparar
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        // if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana champions");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes recien!!");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Mitad de Semana");

        } else if (dia.equals("Jueves")) {
            System.out.println("Mañana Es viernes");

        } else if (dia.equals("Viernes")) {
            System.out.println("Es viernes y tu cuerpo lo sabe..");

        } else if (dia.equals("Sabado")) {
            System.out.println("Hoy es medio dia");

        } else if (dia.equals("Domingo")) {
            System.out.println("Mañana a trabajar de nuevo :( ");

        }  else {
        System.out.println("Dia Invalido");}
    }
}
