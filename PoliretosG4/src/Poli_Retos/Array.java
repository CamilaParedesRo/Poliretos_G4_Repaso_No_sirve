package Poli_Retos;

import java.util.Random;

public class Array {
   
   public void G4_Array_4() {
      System.out.println("Array 4"); 
      String nombre = "Monserrath";
      String apellido = "Rodriguez";
      int longitudNombre = nombre.length();
      int longitudApellido = apellido.length();
      char[][] matriz = new char[longitudNombre][longitudApellido];

      for (int filas = 0; filas < longitudNombre; filas++) {
          for (int columnas = 0; columnas < longitudApellido; columnas++) {
              if (filas + columnas == longitudApellido - 1) {
                  matriz[filas][columnas] = apellido.charAt(filas);
              } else if (filas == columnas) {
                  matriz[filas][columnas] = nombre.charAt(filas);
              } else {
                  matriz[filas][columnas] = ' ';
              }
          }
      }
      for (int filas = 0; filas < longitudNombre; filas++) {
          for (int columnas = 0; columnas < longitudApellido; columnas++) {
              System.out.print(matriz[filas][columnas] + " ");
          }
          System.out.println(); 
      }
      System.out.println(" "); 
  }

//   Crear un matriz cuadrada del tamaño de su nombre, colocar cada letra de 
//   sus nombres completos de forma randomica/aleatorio. 
//           En el caso que conincidan las posiciones poner un *.  
//           Para visulizar el proceso usar un delay  
//           P                           P 
//               a                   a 
//               M   *   i   h   c   e   l 
//                       r   c 
//                       h   i 
//           A   n   *   a   *   *   a   r 
//                                   i 
//                                       o 

  public void G4_Array_5() {
    System.out.println("Array 5"); 
        String nombreCompleto = "CamilaParedes"; // Reemplaza con tu nombre completo
        int longitud = nombreCompleto.length();
        
        // Calcula el tamaño de la matriz cuadrada
        int dimension = (int) Math.ceil(Math.sqrt(longitud));
        char[][] matriz = new char[dimension][dimension];

        // Inicializa la matriz con espacios
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = ' ';
            }
        }

        Random random = new Random();
        int index = 0;
        
        while (index < longitud) {
            int fila = random.nextInt(dimension);
            int columna = random.nextInt(dimension);

            // Si la posición está ocupada, coloca un '*' y continúa
            if (matriz[fila][columna] == ' ') {
                matriz[fila][columna] = nombreCompleto.charAt(index);
                index++;
            } else {
                matriz[fila][columna] = '*';
            }

            // Imprimir la matriz en su estado actual con un delay
            imprimirMatriz(matriz);

        }
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    
}





