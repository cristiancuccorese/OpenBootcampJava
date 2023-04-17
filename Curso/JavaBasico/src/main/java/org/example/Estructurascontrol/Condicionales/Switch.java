package org.example.Estructurascontrol.Condicionales;

public class Switch {
    public static void main(String[] args) {

        String dia = "Sabado";



        switch (dia) {
            case "Lunes":
                System.out.println("Animo con la semana champions");

                break;
            case "Martes":
                System.out.println("Martes recien!!");

                break;
            case "Miercoles":
                System.out.println("Mitad de Semana");

                break;
            case "Jueves":
                System.out.println("Mañana Es viernes");

                break;
            case "Viernes":
                System.out.println("Es viernes y tu cuerpo lo sabe..");

                break;
            case "Sabado":
                System.out.println("Hoy es medio dia");

                break;
            case "Domingo":
                System.out.println("Mañana a trabajar de nuevo :( ");

                break;
            default:
                System.out.println("Dia Invalido");
                break;
        }
    }
}
