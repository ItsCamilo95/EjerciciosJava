package Ejercicios;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Result = 0.0;
        System.out.println("|--> Digite la cantidad de pesos que desea convertir");
        int Coin = input.nextInt();

        System.out.println("|--> Digite la tasa de conversión (usa coma en vez de punto)");
        double Percentage = input.nextDouble();

        Result = Coin * Percentage;

        System.out.println(Coin+" peso(s) Colombiano(s) con la tasa de cambio ingresada es igual a "+(float)Result +" correspondientes a la moneda del país ingresado.");
        //Por ejemplo 10.000 pesos colombianos
        //Con una tasa del 0,00023 correspondiente a los euros
        // Equivalen a 2,3 euros

    }
}
