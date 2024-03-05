package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number1 =  random.nextInt(9) +1;
        int number2 =  random.nextInt(9) +1;
        int total = number1 + number2;
        boolean run = true;
        int trying;
        while(run){
            System.out.println("|---> Bienvenido");
            System.out.println("|--> 1. Adivinar suma");
            System.out.println("|--> 2. Salir");
            int option = input.nextInt();

            if (option == 2){
                run = false;
            }else{
                System.out.println("|--> La máquina ha sumado dos números, puedes adivinar su resultado?");
                trying = input.nextInt();
                if (trying == total){
                    System.out.println("|--> ¡Felicidades, has adivinado la suma!");
                    System.out.println("|--> El sistema sumó: "+number1+" + "+number2+".");
                    run = false;
                }else{
                    System.out.println("|--> ¡Ups... Ese no es el resultado. Sigue intentando.");
                }
            }

        }
        System.out.println("|--> ¡Adiós!");
        System.out.println("|-- Número 1: "+number1);
        System.out.println("|-- Número 2: "+number2);

    }
}
