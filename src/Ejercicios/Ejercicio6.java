package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 0;
        System.out.print("|--> Digite el número de filas de la piramide -> ");
        rows = input.nextInt();

        for (int i = 0; i < rows; i++) {

            //me compliqué un poco la vida agregando los espacios, pero se ve bonito
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
