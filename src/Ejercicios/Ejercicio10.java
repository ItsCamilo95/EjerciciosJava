package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String stringNumber = "";
        int digit = 0;
        int total = 0;
        int counter = 0;

        System.out.print("|--> Bienvenido, por favor digita un número -> ");
        number = input.nextInt();
        if(number > 0){
            stringNumber = String.valueOf(number);
        }else{
            System.out.println("El número debe ser positivo");
            System.exit(0);
        }

        System.out.print("|--> Por favor digita el número a buscar -> ");
        digit = input.nextInt();

        for (int i = 0; i < stringNumber.length(); i++) {
            if((int)stringNumber.charAt(i) - '0' == digit){
                counter++;
            }
        }
        if (counter != 0){
            System.out.println("|--> El dígito: "+digit+" se encontró "+counter+" vez(ces).");
        }else{
            System.out.println("|--> El dígito no fué encontrado.");
        }
    }
}
