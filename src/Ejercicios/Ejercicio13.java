package Ejercicios;

import java.util.Vector;

public class Ejercicio13 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(24);
        numbers.add(5);
        numbers.add(6);
        int greater = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > greater){
                greater = numbers.get(i);
            }
        }
        System.out.println("El número más grande del vector es: "+greater);
    }
}
