package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio14 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(3);

        ArrayList newList = new ArrayList();

        Iterator i = lista.iterator();
        while(i.hasNext()){
            int number = (int)i.next();
            if(!newList.contains(number)){
                newList.add(number);
            }
        }
        System.out.println("La lista sin duplicados es: ");
        Iterator j = newList.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }


    }
}
