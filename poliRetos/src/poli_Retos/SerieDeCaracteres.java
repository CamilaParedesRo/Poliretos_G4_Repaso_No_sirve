package poli_Retos;

import java.util.Scanner;

public class SerieDeCaracteres {
    //muestra la serie S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
    public void G4_SeriesDeCaracteres_SC5(Scanner scanner) {
        System.out.println("Serie de caractes 05");
        System.out.println("Ingrese el numero de elementos que desea que tenga la serie: ");
        int cantidad = scanner.nextInt();
        String [] patron;
        patron = new String[] {"\\","|","/"," -"," | "};
        System.out.println();
        for (int i = 0; i < cantidad; i++) {
            System.out.print(patron[i%5] + " ");
        }
       
    }

}
