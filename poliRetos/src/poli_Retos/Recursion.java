package poli_Retos;

import java.util.Scanner;

public class Recursion {

    /**
     * muestra una recursividad para R01) crear un metodo recursivo para obtener factorial(n)  
     * @return: Integer
     */
         public int G4_Recursion_1(int factorial) {
            System.out.println("Recursion 01");
        if (factorial == 0) {
            return 1;
        } else {
            // Llamada recursiva: n! = n * (n-1)!
            return factorial * G4_Recursion_1(factorial - 1);
        }    
    }

    /**
     * muestra una recursividad para R06) crear un metodo recursivo para obtener la conteoRegresivo(n)  hasta 0
     */ 
    public void G4_Recursion_6(int numero) {
        System.out.println("Recursion 06");
        if (numero >= 0) {
            System.out.println("Conteo: " + numero);
            G4_Recursion_6(numero - 1);
        }  
    }

}
