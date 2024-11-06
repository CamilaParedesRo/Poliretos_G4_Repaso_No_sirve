package poliretos;

public class Cadenas {

     /**
     * muestra el número de letras de una cadena C02) Pedir una frase y contador las letras. 
     */
    public void mostrarCadena2(String frase) {
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
    public void mostrarCadena7(String frase) {
        char [] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (char fraseInvertida : fraseCaracteres) {
            if (fraseInvertida != 'j')
                System.out.print(Character.toUpperCase(fraseInvertida));
            }
    }

}
