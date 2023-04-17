package org.example.Estructurascontrol.Repetitivas;

public class While {
    public static void main(String[] args) {

        int contador = 0;

        while(contador < 10){

            contador++;
            if (contador == 5){
                break;
            }
            System.out.println("Valor de contador: " + contador);
        }
    }
}
