package Ejercicios;


import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        String stringNumber = "";
        System.out.println("|--> Digita un número de 3 dígitos");
        number = input.nextInt();

        stringNumber = String.valueOf(number);


        //1 digit
        if ((int)stringNumber.charAt(0) - '0' > (int)stringNumber.charAt(1) - '0' && (int)stringNumber.charAt(0) - '0' > (int)stringNumber.charAt(2) - '0'){
            System.out.print((int)stringNumber.charAt(0) - '0');
            if ((int)stringNumber.charAt(1) - '0' > (int)stringNumber.charAt(2) - '0'){
                System.out.print((int)stringNumber.charAt(1) - '0');
                System.out.print((int)stringNumber.charAt(2) - '0');
            }else{
                System.out.print((int)stringNumber.charAt(2) - '0');
                System.out.print((int)stringNumber.charAt(1) - '0');
            }
        }

        //2 digit
        if ((int)stringNumber.charAt(1) - '0' > (int)stringNumber.charAt(0) - '0' && (int)stringNumber.charAt(1) - '0' > (int)stringNumber.charAt(2) - '0'){
            System.out.print((int)stringNumber.charAt(1) - '0');
            if ((int)stringNumber.charAt(0) - '0' > (int)stringNumber.charAt(2) - '0'){
                System.out.print((int)stringNumber.charAt(0) - '0');
                System.out.print((int)stringNumber.charAt(2) - '0');
            }else{
                System.out.print((int)stringNumber.charAt(2) - '0');
                System.out.print((int)stringNumber.charAt(0) - '0');
            }
        }

        //3 digit
        if ((int)stringNumber.charAt(2) - '0' > (int)stringNumber.charAt(0) - '0' && (int)stringNumber.charAt(2) - '0' > (int)stringNumber.charAt(1) - '0'){
            System.out.print((int)stringNumber.charAt(2) - '0');
            if ((int)stringNumber.charAt(0) - '0' > (int)stringNumber.charAt(1) - '0'){
                System.out.print((int)stringNumber.charAt(0) - '0');
                System.out.print((int)stringNumber.charAt(1) - '0');
            }else{
                System.out.print((int)stringNumber.charAt(1) - '0');
                System.out.print((int)stringNumber.charAt(0) - '0');
            }
        }
    }
}
