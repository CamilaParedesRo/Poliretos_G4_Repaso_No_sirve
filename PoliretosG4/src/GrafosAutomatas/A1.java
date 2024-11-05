package GrafosAutomatas;

import java.util.Scanner;

// Automatas para validar: a*b+c 
public class A1 {
   
   public static boolean validarCadena(String cadena) {
      int estado = 0; 
      for (int i = 0; i < cadena.length(); i++) {
          char simbolo = cadena.charAt(i);
          switch (estado) {
              case 0:
                  if (simbolo == 'a') {
                      estado = 0;
                  } else if (simbolo == 'b') {
                      estado = 1;
                  } else {
                      return false;
                  }
                  break;

              case 1:
                  if (simbolo == 'b') {
                      estado = 1;
                  } else if (simbolo == 'c') {
                      estado = 2;
                  } else {
                      return false;
                  }
                  break;

              case 2:
                  return false;
          }
      }
      return estado == 2;
  }
  
  public void automata1() {
   Scanner scanner = new Scanner(System.in);  
   System.out.println("Escriba una cadena para validar: ");
   String cadena = scanner.nextLine();

      if (validarCadena(cadena)) {
          System.out.println("La cadena es válida");
      } else {
          System.out.println("La cadena no es válida");
      }
      scanner.close();
  } 
}
  
  
  
