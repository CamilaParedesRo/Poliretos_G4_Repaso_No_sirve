package GrafosAutomatas;


import java.util.Scanner;

/*
    Crear un compilador para validar el sigueinte lenguaje L ={for, if, else, 
    ifelse, foreach} 
        considerar los caracteres de aceptacion, Ejemplo: 
        for( 
        for (  
*/
public class A6 {
    public enum Estado {
        q0, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, qError
    }

    public static Estado transicion(Estado estadoActual, char c) {
        switch (estadoActual) {
            case q0:
                if (c == 'f') return Estado.q1;
                if (c == 'i') return Estado.q4;
                return Estado.qError;

            case q1:
                if (c == 'o') return Estado.q2;
                return Estado.qError;

            case q2:
                if (c == 'r') return Estado.q3;
                return Estado.qError;

            case q3: // Estado de aceptación para "for("
                if (c == '(') return Estado.q0;
                return Estado.qError;

            case q4:
                if (c == 'f') return Estado.q5;
                return Estado.qError;

            case q5: // Estado de aceptación para "if("
                if (c == '(') return Estado.q0;
                if (c == 'e') return Estado.q6;
                return Estado.qError;

            case q6:
                if (c == 's') return Estado.q7;
                return Estado.qError;

            case q7:
                if (c == 'e') return Estado.q8;
                return Estado.qError;

            case q8: // Estado de aceptación para "ifelse("
                if (c == '(') return Estado.q0;
                return Estado.qError;

            case q9:
                if (c == 'e') return Estado.q10;
                return Estado.qError;

            case q10:
                if (c == 'h') return Estado.q11;
                return Estado.qError;

            case q11: // Estado de aceptación para "foreach("
                if (c == '(') return Estado.q0;
                return Estado.qError;

            default:
                return Estado.qError;
        }
    }

    // Método para verificar si una cadena es válida en el lenguaje
    public static boolean validarCadena(String cadena) {
        Estado estadoActual = Estado.q0;

        for (char c : cadena.toCharArray()) {
            estadoActual = transicion(estadoActual, c);
            if (estadoActual == Estado.qError) {
                return false; // La cadena no es válida
            }
        }

        // Verificar si el estado final es un estado de aceptación
        return estadoActual == Estado.q3 || estadoActual == Estado.q5 || estadoActual == Estado.q8 || estadoActual == Estado.q11;
    }

    // Método para ejecutar el autómata
    public void automata6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String cadena = scanner.nextLine();

        if (validarCadena(cadena)) {
            System.out.println("La palabra es válida en el lenguaje L.");
        } else {
            System.out.println("La palabra no es válida en el lenguaje L.");
        }
        scanner.close();
    }
}