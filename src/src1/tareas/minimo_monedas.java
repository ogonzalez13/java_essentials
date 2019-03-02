package src1.tareas;

import libs.Input;
public class minimo_monedas {

    public static void main (String [] args){
        System.out.print("Hola! ¿cuánto cambio te debo? (dame la cifra en fracción)");
        float Cash = Input.get_float();

        float [] Monedas = new float[4]; //Monedas ha contar
        Monedas[0] = (float) 0.25;
        Monedas[1] = (float) 0.10;
        Monedas[2] = (float) 0.05;
        Monedas[3] = (float) 0.01;

        int [] Contador = new int[4]; //Repositorio de monedas
        float Resto = Cash;
        int i=0; //Contador

        while (Resto==0) {
            //cociente=dividendo/divisor;
            //residuo=dividendo%divisor;
            Contador =
        }

    }

}
