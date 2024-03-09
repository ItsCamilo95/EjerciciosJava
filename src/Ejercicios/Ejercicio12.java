package Ejercicios;

import java.util.Vector;
import java.util.Iterator;

public class Ejercicio12 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        int total = 1;
        Iterator<Integer> i = numbers.iterator();
        while(i.hasNext()){
            int number = i.next();
            if (number % 2 == 0) {
                total *= number;
            }
        }
        System.out.println("El producto de los pares del vector es: "+total);
    }
}
