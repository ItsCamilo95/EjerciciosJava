package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String stringNumber = "";
        int total = 0;

        System.out.print("|--> Bienvenido, por favor digita un número -> ");
        number = input.nextInt();
        if(number > 0){
            stringNumber = String.valueOf(number);
        }else{
            System.out.println("El número debe ser positivo");
            System.exit(0);
        }

        for (int i = 0; i < stringNumber.length(); i++) {
            //Los números en la tabla ascii empiezan desde el 48 y van en secuencia ordenada
            // con charAt accedo a la posición en dicha tabla, si le quito el '0', estaría restando el 48
            //y da como resultado el dígito seleccionado.
            total += (int)stringNumber.charAt(i) - '0';
        }

        System.out.println("|--> La suma de todos los dígitos es: "+total);
    }
}
