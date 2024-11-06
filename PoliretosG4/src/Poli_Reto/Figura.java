package Poli_Reto;

import java.util.Scanner;

public class Figura {

    public void G4_Figura_4(Scanner scanner) {
        
        
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

    public void G4_Figura_9(Scanner scanner) {
        int desplazamiento;
        
        System.out.println("Ingrese el número de la extensión de la escalera: ");
        desplazamiento = scanner.nextInt();
    
        int numeroColumna = (2 * desplazamiento) - 1;
    
        for (int fila = 0; fila < desplazamiento; fila++) {
            for (int columna = 1; columna <= numeroColumna; columna++) {
                if (fila > 0 && (columna == (desplazamiento - fila) || columna == (desplazamiento + fila))) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    

    

    public void G4_Figura_14(Scanner scanner) {
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
    public void G4_Figura_19(Scanner scanner){
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
    
    


