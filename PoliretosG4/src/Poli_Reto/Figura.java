package Poli_Reto;

import java.util.Scanner;

public class Figura {

    public void Figura4(Scanner scanner) {
        
        
        System.out.print("Ingrese el tamaño: ");
        int tamaño = scanner.nextInt();
        
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= tamaño - i; j++) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public void Figura09(Scanner scanner){
        int desplazamiento;
       
        System.out.println("Ingrese el número de la extensión de la escalera: ");
        desplazamiento = scanner.nextInt();

        for (int filas = 1; filas <= desplazamiento; filas++) {
           
            for (int columnas = 1; columnas <= filas; columnas++) {
                System.out.print("   "); // Espacios en blanco a la izquierda de la escalera
            }
            System.out.print("__|");

            
            int espaciosCentro = (desplazamiento - filas) * 3;
            for (int i = 0; i < espaciosCentro; i++) {
                System.out.print(" ");
            }

           
            for (int columnas = 1; columnas <= filas; columnas++) {
                if (columnas == 1) {
                    System.out.print("|__");
                } else {
                    System.out.print("   "); 
                }
            }

            System.out.println();
        }
    }
    

    

    public void Figura14(Scanner scanner) {
        System.out.print("Introduce el número de filas para el Triángulo de Pascal: ");
        int filas = scanner.nextInt();

        for (int i = 0; i < filas; i++) {
           
            for (int j = 0; j < filas - i; j++) {
                System.out.print(" ");
            }

            int valor = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " ");
                valor = valor * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    public void Figura19(Scanner scanner){
        System.out.print("Introduce el número de filas para el patrón triangular: ");
        int filas = scanner.nextInt();
        
        System.out.print("Introduce el número inicial: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print("+ ");
                } else if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print(numero + " ");
                    numero++;
                }
            }
            System.out.println();
        }

        
    }
}
    
    


