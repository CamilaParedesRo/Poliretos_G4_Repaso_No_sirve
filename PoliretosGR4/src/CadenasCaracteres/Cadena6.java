package CadenasCaracteres;

public class Cadena6 {
    public void invertirMayusculas(String frase) {
        String fraseInvertida = invertirYConvertirAMayusculas(frase);
        System.out.println("Frase invertida y en mayúsculas: " + fraseInvertida);
    }

    private String invertirYConvertirAMayusculas(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();
        return builder.toString().toUpperCase();
    }
}
