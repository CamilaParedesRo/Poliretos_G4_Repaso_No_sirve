package Figuras;
import java.util.Scanner;

public class Figura5 {
    public void dibujar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas para la Figura F5 (Pirámide Invertida): ");
        int numeroFilas = scanner.nextInt();
        generar(numeroFilas);
    }

    private void generar(int numeroFilas) {
        System.out.println("Figura F5: Pirámide Invertida");

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (numeroFilas - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
