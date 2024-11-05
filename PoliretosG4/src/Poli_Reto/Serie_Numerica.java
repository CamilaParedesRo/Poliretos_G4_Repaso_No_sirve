
package Poli_Reto;

import java.util.Scanner;

public class Serie_Numerica {
    
    public void SerieS3(Scanner scanner) {
        System.out.print("Ingrese el límite de la serie S3: ");
        int limit = scanner.nextInt(); 
    
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador = 1;
    
        for (int i = 0; i < limit; i++) {
            System.out.print(numerador1 + "/" + denominador + " ");
    
            int temp = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = temp;
    
            denominador += 2;
        }
        System.out.println(); 
    }

    public void SerieS8(Scanner scanner) {
        System.out.print("Ingrese el límite de la serie S8: ");
        int limite = scanner.nextInt(); 
        int termino = 3;
        int aumentador = 5;

        for (int i = 0; i < limite; i++) {
            termino = termino + aumentador;
            System.out.print(termino + " ");
        }
        System.out.println(); 
    }
}
