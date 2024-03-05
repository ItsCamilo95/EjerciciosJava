package Ejercicios;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite un año");
        int year = input.nextInt();
        System.out.println(year);

        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 != 0){
                System.out.println("El año no es bisiesto");
            }else{
                System.out.println("El año es bisiesto");
            }
        }else{
            System.out.println("El año no es bisiesto");
        }
    }
}
