package Figuras;
import java.util.Scanner;

public class Figura10 {
    public void dibujar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas para la Figura F10: ");
        int numeroFilas = scanner.nextInt();
        generar(numeroFilas);
    }

    private void generar(int numeroFilas) {
        System.out.println("Figura F10:");

        for (int i = 1; i <= numeroFilas; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            System.out.print("+");
            for (int k = 1; k < i; k++) {
                System.out.print(" _");
            }
            System.out.println();
        }
    }
}
