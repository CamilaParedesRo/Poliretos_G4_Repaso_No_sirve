package SeriesNumericas;

public class Serie9 {
    public void generar(int numeroTerminos) {
        System.out.println("Serie numerica S9:");
        int valor = 2;
        
        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print(valor + " ");
            valor *= 2;
        }
        System.out.println();
    }
}
