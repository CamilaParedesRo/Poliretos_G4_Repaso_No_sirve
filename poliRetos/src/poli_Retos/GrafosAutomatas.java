package poli_Retos;

import java.util.Scanner;

public class GrafosAutomatas {

    public boolean G4_Automata_5(Scanner scanner) {
        System.out.println("Automata 05 ");
        System.out.println("Escriba una cadena para validar: ");
        String cadena = scanner.nextLine();
        int estado = 0; 
        cadena = cadena.trim();
        int longitud = cadena.length();

        for (int i = 0; i < longitud; i++) {
            char c = cadena.charAt(i);

            switch (estado) {
                case 0:
                    if (esLetra(c) || c == '$' || c == '_') {
                        estado = 1; 
                    } else {
                        return false;
                    }
                    break;

                case 1:
                    if (esLetra(c) || esNumero(c) || c == '$' || c == '_') {
                        estado = 1; 
                    } else if (c == ';' && i == longitud - 1) {
                        estado = 2; 
                    } else {
                        return false; 

                case 2:
                    return false;
            }
        }
        return estado == 2;
    }
    private boolean esLetra(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    private boolean esNumero(char c) {
        return (c >= '0' && c <= '9');
    }
}
