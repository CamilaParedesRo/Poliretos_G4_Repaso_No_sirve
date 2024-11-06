package poliretos;

public class SecuenciasNumericas {
    //*** muestra la serie  S5: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31... 
    public void mostrarSecuencia5() {
        int count = 0;
        for (int i = 2; count < 11; i++) { 
            boolean esPrimo = true; 
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false; 
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    //*** muestra la serie  S10: 3, 9, 27, 81, 243, 729, 2187, ...
    public void mostrarSecuencia(int numeroDeTerminos){
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            System.out.print(numeroDeTerminos + " ");
            numeroDeTerminos *= 3; 
        }
    }


}
