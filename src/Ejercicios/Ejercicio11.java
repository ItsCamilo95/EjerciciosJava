package Ejercicios;

import java.util.Iterator;
import java.util.Vector;

public class Ejercicio11 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int total = 0;
        Iterator i = numbers.iterator();
        while(i.hasNext()){
            total+=(int)i.next();
        }
        System.out.println("La suma de los elementos del vector es: "+total);
    }
}
