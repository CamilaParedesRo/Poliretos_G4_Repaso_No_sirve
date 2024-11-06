package SeriesNumericas;

public class Serie12 {
    public void generar(int numeroTerminos) {
        System.out.println("Serie numerica S12:");
        int valor = 2;
        int incremento = 4;
        
        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print(valor + " ");
            valor += incremento;
            incremento += 2;
        }
        System.out.println();
    }
}
