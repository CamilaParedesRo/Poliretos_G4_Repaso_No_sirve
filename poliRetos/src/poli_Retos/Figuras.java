package poli_Retos;

import java.util.Scanner;

public class Figuras {
    /**
    muestra la figura F1:
    * * * * *
    *       *
    *       *  
    *       *           
    * * * * *
    */
    public void G4_Figuras_1(Scanner scanner) {
        System.out.println("Figura 01"); 
         System.out.println("Ingrese el numero de * que tendra la figura de ancho y largo (solo ingrese un numero): ");
         int numeroNiveles = scanner.nextInt();
         for (int i = 0; i < numeroNiveles; i++) {
            for (int j = 0; j < numeroNiveles; j++) {
                if (i == 0 || i == numeroNiveles - 1 || j == 0 || j == numeroNiveles - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacio para el interior
                }
            }
            System.out.println();
        }
    }

    /**
     * muestra la figura F6:	
		     *
		    ***
		   *****                    
		  *******
		 ********* 
     */
    public void G4_Figuras_6(Scanner scanner) {
        System.out.println("Figura 06");  
        System.out.println("Ingrese el numero de niveles de la piramide: ");
        int numeroNiveles = scanner.nextInt();
        for (int filas = numeroNiveles; filas > 0; filas--) {
            for (int espacio = 0; espacio < filas; espacio++) {
                System.out.print(" ");
            }
            for (int nroCaracteres = numeroNiveles; nroCaracteres >= filas; nroCaracteres--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     /**
     * muestra la figura F11:	
            | _ 
               | _ _
                    | _ _ _
                           | _ _ _ _            
                                    | _ _ _ _ _
     */  
    public void G4_Figuras_11(Scanner scanner) {
        System.out.println("Figura 11"); 
        System.out.println("Ingrese el numero de niveles de la escalera: ");
        int numeroNiveles = scanner.nextInt();
        StringBuilder caracteres = new StringBuilder("|");
        StringBuilder espacios = new StringBuilder(""); 
        StringBuilder addespacios = new StringBuilder("   ");
        for (int filas = 0; filas < numeroNiveles; filas++){
            System.out.println(caracteres.append(" _"));
            System.out.print(espacios.append(addespacios));
            addespacios.append("  ");
        }
    }

    /**
     * muestra la figura F16:
            +				+
                -		-
                    +                       
                -		-
            +				+
            ....
     */
    public void G4_Figuras_16(Scanner scanner) {
        System.out.println("Figura 16");  
        System.out.println("Ingrese el numero de niveles : ");
        int numeroNiveles = scanner.nextInt();
        for (int i = 0; i < numeroNiveles; i++) {
            for (int j = 0; j < numeroNiveles; j++) {
                if (i==j || i==numeroNiveles-1-j) {
                    if (i%2==0 && j%2==0) {
                        System.out.print("- ");
                    }
                    else
                        System.out.print("+ ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }    
    }

}
