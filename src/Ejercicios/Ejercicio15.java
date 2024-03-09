package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio15 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);

        ArrayList newList = new ArrayList();

        Iterator i = lista.iterator();
        while(i.hasNext()){
            int number = (int)i.next();
            if(number % 2 == 0){
                newList.add(number);
            }
        }
        System.out.println("La lista sin impares es: ");
        Iterator j = newList.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }


    }
}
