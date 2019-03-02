package src1.tareas;

import libs.Input;
public class BotellasAgua {

    public static void main (String [] args) {
        System.out.print("Minutos que duró la ducha: ");
        int minutos = Input.get_int();
        int TotalBotellas = minutos * 12;
        if (minutos == 1) {
            System.out.print("Se gastaron " + TotalBotellas + " botellas de agua en " + minutos + " minuto");
        } else {
            System.out.print("Se gastaron " + TotalBotellas + " botellas de agua en " + minutos + " minutos");
        }

    }

}
