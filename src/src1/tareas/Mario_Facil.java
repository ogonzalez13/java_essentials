package src1.tareas;

import libs.Input;

public class Mario_Facil {

    public static void main  (String [] args) {
        System.out.print("Dame la altura: ");
        int altura = Input.get_int();

        int blank= altura - 1;
        int star = altura - blank;
        for (int num = 0; num < altura ; num += 1) { //Altura de la piramide
            for (int i = 0; i < blank ; i += 1) { // espacios en blanco
                System.out.print(" ");
            }
            for (int j = 0; j < star ; j += 1) { // asteriscos
                System.out.print("*");
            }
            System.out.print("* \n");
            blank -= 1;
            star += 1;
        }

    }

}
