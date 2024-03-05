package Ejercicios;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money;
        float interest;
        short years;
        double operation;
        double total;
        short counter = 0;
        System.out.println("|--> Bienvenido, ¡vamos a calcular tus ganancias!");
        System.out.print("|--> Ingresa el dinero inicial ->");
        money = input.nextInt();
        total = money;

        System.out.print("|--> Ingresa la tasa de interés anual ->");
        interest = input.nextFloat();

        System.out.print("|--> Ingresa el número de años ->");
        years = input.nextShort();

        System.out.println("|--> ¡El sistema calculará tus ganancias!");

        do{
            operation = money * interest/100;
            money = money + (int)operation;
            //Tener en cuenta que el siguiente año ya no habrá el dinero inicial, sino el dinero con los intereses del año anterior
            System.out.println("Para el año "+(counter+1)+" tendrá: "+(int)money+", "+"el dinero será invertido nuevamente.");
            total = total + operation;
            counter++;
        }while (counter<years);

        System.out.println("|--> En "+years+" años tendrá: "+(int)total);

    }
}
