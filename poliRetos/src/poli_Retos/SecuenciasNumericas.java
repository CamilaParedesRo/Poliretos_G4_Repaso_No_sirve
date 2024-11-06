package poli_Retos;

import java.util.Scanner;

public class SecuenciasNumericas {
    //*** muestra la serie  S5: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31... 
    public void G4_SeriesNumericas_S5(Scanner scanner) {
        System.out.println("Serie numerica 05");
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 2; count < n; i++) { 
            boolean esPrimo = true; 
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false; 
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    //*** muestra la serie  S10: 3, 9, 27, 81, 243, 729, 2187, ...
    public void G4_SeriesNumericas_S10(Scanner scanner){
        System.out.println("Serie numerica 10");
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        int numeroDeTerminos = scanner.nextInt();
        int numero = 3;
        for (int i = 1; i <= numeroDeTerminos; i++) {
            System.out.print(numero + " ");
            numero *= 3; 
        }
    }


}
