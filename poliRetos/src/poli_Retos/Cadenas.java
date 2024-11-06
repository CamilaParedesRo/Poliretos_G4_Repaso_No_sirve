package poli_Retos;

import java.util.Scanner;

public class Cadenas {

     /**
     * muestra el número de letras de una cadena C02) Pedir una frase y contador las letras. 
     */
    public void G4_CadenadeCaracteres_2(Scanner scanner) {
        System.out.println("Cadena de caracteres 2"); 
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " letras.");
    }

    /**
     * muestra la cadena C07: Pedir una frase y presentarla en mayusculas y sin la J.
     */
    public void G4_CadenadeCaracteres_7(Scanner scanner) {
        System.out.println("Cadena de caracteres 3");
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        char [] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (char fraseInvertida : fraseCaracteres) {
            if (fraseInvertida != 'j')
                System.out.print(Character.toUpperCase(fraseInvertida));
            }
    }

}
