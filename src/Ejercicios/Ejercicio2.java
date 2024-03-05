package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean run = true;
        int opcion = 0;
        while (run) {
            int Machine = random.nextInt(3) + 1;

            System.out.println("Bienvenido. ¿Qué elijes?");
            System.out.println("|--> 1. Piedra");
            System.out.println("|--> 2. Papel");
            System.out.println("|--> 3. Tijera");

            int User = input.nextInt();

            if (User > 0 && User < 4) {
                System.out.println("Es turno de la máquina :) ");
                System.out.println("La máquina elije... ");
                System.out.println("--->" + Machine);
                if (User == Machine) {
                    System.out.println("|--> ¡Es un empate!");
                } else if (User == 1 && Machine == 3) {
                    System.out.println("|--> Piedra gana a Tijera. ¡¡Tú ganas!!");
                } else if (User == 2 && Machine == 1) {
                    System.out.println("|--> Papel gana a Piedra. ¡¡Tú ganas!!");
                } else if (User == 3 && Machine == 2) {
                    System.out.println("|--> Tijera gana a Papel. ¡¡Tú ganas!!");
                } else {
                    System.out.println("|---> La máquina eligió mejor que tú. ¡Perdiste!");
                }
            } else {
                System.out.println("|--> Por favor ingresa una opción válida");
            }
            System.out.println("|---> ¿Quieres jugar otra vez?");
            System.out.println("|-- 1. Si");
            System.out.println("|-- 2. No");
            opcion = input.nextInt();
            if (opcion == 2) {
                run = false;
                System.out.println("|--> ¡Adiós!");
            }
        }
    }
}
