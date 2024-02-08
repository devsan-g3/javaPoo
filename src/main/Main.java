package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n------------ ALGORITMOS -------------\n");
            System.out.println("1. Ejercicio 1");
            System.out.println("3. Ejercicio 3");
            System.out.println("5. Ejercicio 5");
            System.out.println("7. Ejercicio 7");
            System.out.println("9. Ejercicio 9");
            System.out.println("11. Ejercicio 11");
            System.out.println("13. Ejercicio 13");
            System.out.println("15. Ejercicio 15");
            System.out.println("17. Ejercicio 17");
            System.out.println("19. Ejercicio 19");
            System.out.println("21. Ejercicio 21");
            System.out.println("23. Ejercicio 23");
            System.out.println("25. Ejercicio 25");
            System.out.println("27. Ejercicio 27");
            System.out.println("29. Ejercicio 29");
            System.out.println("31. Ejercicio 31");
            System.out.println("0. Salir");
            System.out.print("Ingrese el número de ejercicio que desea ejecutar: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicios.algoritmo1();
                    break;
                case 2:
                    Ejercicios.algoritmo3();
                    break;
                case 3:
                    Ejercicios.algoritmo5();
                    break;
                case 4:
                    Ejercicios.algoritmo7();
                    break;
                case 5:
                    Ejercicios.algoritmo9();
                    break;
                case 6:
                    Ejercicios.algoritmo11();
                    break;
                case 7:
                    Ejercicios.algoritmo13();
                    break;
                case 8:
                    Ejercicios.algoritmo15();
                    break;
                case 9:
                    Ejercicios.algoritmo17();
                    break;
                case 10:
                    Ejercicios.algoritmo19();
                    break;
                case 11:
                    Ejercicios.algoritmo21();
                    break;
                case 12:
                    Ejercicios.algoritmo23();
                    break;
                case 13:
                    Ejercicios.algoritmo25();
                    break;
                case 14:
                    Ejercicios.algoritmo27();
                    break;
                case 15:
                    Ejercicios.algoritmo29();
                    break;
                case 16:
                    Ejercicios.algoritmo31();
                    break;
                    
                case 0:
                    System.out.println("Ha salido de los algortimos.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
