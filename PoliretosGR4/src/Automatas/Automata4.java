package Automatas;

public class Automata4 {
    public void ejecutar(String[] pruebas) {
        for (String prueba : pruebas) {
            System.out.println("La cadena \"" + prueba + "\" es un número decimal válido: " + esDecimal(prueba));
        }
    }

    public static boolean esDecimal(String cadena) {
        boolean tienePunto = false; // Marca si ya encontramos un punto decimal
        boolean tieneDigito = false; // Marca si ya encontramos al menos un dígito

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (Character.isDigit(c)) {
                tieneDigito = true; // Marcamos que hay al menos un dígito
            } else if (c == '.') {
                // Si ya hay un punto, es inválido
                if (tienePunto) {
                    return false;
                }
                tienePunto = true; // Marcamos que encontramos un punto
            } else {
                // Cualquier otro carácter hace que la cadena no sea válida
                return false;
            }
        }
        // La cadena es válida si tiene al menos un dígito
        return tieneDigito;
    }
}
