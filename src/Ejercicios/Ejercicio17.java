package Ejercicios;

import java.util.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputNumbers = new Scanner(System.in);

        Map<String, List<Integer>> calification = new HashMap<>();

        boolean run = true;

        System.out.println("|-- Bienvenido");
        System.out.println("|- ¡Calculemos las notas de los estudiantes!");

        while(run){
            System.out.println("|- Ingrese el nombre del estudiante: ");
            String name = input.nextLine();
            ArrayList notes = new ArrayList();

            System.out.println("|- Ingrese la primer nota del estudiante: ");
            notes.add(inputNumbers.nextInt());
            System.out.println("|- Ingrese la segunda nota del estudiante: ");
            notes.add(inputNumbers.nextInt());
            System.out.println("|- Ingrese la tercer nota del estudiante: ");
            notes.add(inputNumbers.nextInt());

            calification.put(name, notes);
            System.out.println("|- ¿Desea agregar otro estudiante? ");
            System.out.println("1. Si, 2.no");
            int option = inputNumbers.nextInt();
            if (option == 2){
                System.out.println("¡Te muestro los resultados!");
                run = false;
            }
        }
        System.out.println("|-- Base de datos de estudiantes: ");
        /*en este ejercicio entendí todo excepto los parámetros del foreach, tuve que investigarlos ya que mi intención
        era recorrer el hashmap para imprimirlo de manera más limpia.*/
        for (Map.Entry<String, List<Integer>> entry : calification.entrySet()) {

            System.out.println("|---------------------------------------|");
            System.out.println("Estudiante: " + entry.getKey() + ", Notas: " + entry.getValue());
            Iterator i = entry.getValue().iterator();
            int average = 0;
            while(i.hasNext()){
                int number = (int)i.next();
                average += number;
            }
            System.out.println("El promedio de "+entry.getKey()+" es: "+average/3);
            System.out.println("|---------------------------------------|");
        }
        System.out.println("|-- Esos fueron todos los estudiantes. ¡Adiós!");

    }
}
