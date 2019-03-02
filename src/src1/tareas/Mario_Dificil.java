package src1.tareas;

import libs.Input;

public class Mario_Dificil {

    public static void main (String [] args){
        System.out.print("Inserta el altura de la piramide: ");
        int altura = Input.get_int();
        piramide (altura);
    }

    public static void piramide (int high) {

        int blank= high - 1;
        int star = high - blank;
        for (int num = 0; num < high ; num += 1) { //Altura de la piramide
            for (int i = 0; i < blank ; i += 1) { // espacios en blanco
                System.out.print(" ");
            }
            for (int j = 0; j < star ; j += 1) { // asteriscos
                System.out.print("*");
            }
            System.out.print("  "); //espacio en medio
            for (int j = 0; j < star ; j += 1) { // asteriscos segunda parte
                System.out.print("*");
            }
            System.out.print("\n");
            blank -= 1;
            star += 1;
        }

    }

}
