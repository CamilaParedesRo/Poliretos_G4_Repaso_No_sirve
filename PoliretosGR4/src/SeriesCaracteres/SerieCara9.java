package SeriesCaracteres;

public class SerieCara9 {
    public void generar(int numeroTerminos) {
        System.out.println("Serie de caracteres S9:");

        int repeticiones = 1; // Primer término de repeticiones
        int siguienteRepeticiones = 1; // Segundo término de repeticiones
        
        char letra = 'a'; // Comenzamos con la letra 'a'
        
        for (int i = 0; i < numeroTerminos; i++) {
            // Imprimir la letra actual el número de veces correspondiente
            for (int j = 0; j < repeticiones; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");

            // Actualizar la letra para el siguiente término
            letra++;

            // Calcular el siguiente término de la secuencia de repeticiones
            int nuevoRepeticiones = repeticiones + siguienteRepeticiones;
            repeticiones = siguienteRepeticiones;
            siguienteRepeticiones = nuevoRepeticiones;
        }
        System.out.println();
    }
}
