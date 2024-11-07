package SeriesCaracteres;

public class SerieCara4 {
    public void generar(int numeroTerminos) {
        System.out.println("Serie de caracteres S4:");

        char[] simbolos = {'+', '-', '*', '/'};
        
        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print(simbolos[i % 4] + " ");
        }
        System.out.println();
    }
}
