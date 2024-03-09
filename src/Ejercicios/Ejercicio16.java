package Ejercicios;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio16 {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Jorge");
        names.put(2, "Pepe");
        names.put(3, "Juana");
        names.put(4, "Dahiana");
        names.put(5, "Camilo");

        for (int i = 0; i < names.size(); i++) {
            if (i < 3){
                names.remove(i);
            }
        }
        System.out.println("El mapa final es: ");
        System.out.println(names);
    }
}
