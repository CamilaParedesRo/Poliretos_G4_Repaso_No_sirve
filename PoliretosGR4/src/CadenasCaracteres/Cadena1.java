package CadenasCaracteres;

public class Cadena1 {
    public void contarVocales(String frase) {
        int contadorVocales = contarVocalesEnFrase(frase);
        System.out.println("La frase \"" + frase + "\" tiene " + contadorVocales + " vocales.");
    }

    private int contarVocalesEnFrase(String frase) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        return contador;
    }
}
