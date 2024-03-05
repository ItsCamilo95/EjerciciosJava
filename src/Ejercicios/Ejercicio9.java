package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int bigger = 0;
        boolean found = false;
        System.out.println("|---> Bienvenido, ¡calculemos el MCD!");
        System.out.println("|-- Ingresa el primer número: ");
        number1 = input.nextInt();
        System.out.println("|-- Ingresa el segundo número: ");
        number2 = input.nextInt();
        if ((number1 > number2) && (number1 >= 0) && (number2>=0)){
            bigger = number1;
        }else if ((number1 >= 0) && (number2>=0)){
            bigger = number2;
        }else{
            System.out.println("|-- Los números Ingresados no tienen MCD.");
            System.exit(1);
        }
        for (int i = bigger; i > 0; i--){
            if (number1 % i == 0 && number2 % i == 0){
                System.out.println("|-- El número: "+i+" es el MCD de los números ingresados.");
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("|-- Los números Ingresados no tienen MCD.");
        }


    }
}
