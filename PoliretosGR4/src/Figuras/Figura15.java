package Figuras;
import java.util.Scanner;

public class Figura15 {
    public void dibujar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas para el Triángulo de Pascal (Figura F15): ");
        int numeroFilas = scanner.nextInt();
        generar(numeroFilas);
    }

    private void generar(int numeroFilas) {
        System.out.println("Triángulo de Pascal:");

        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroFilas - i; j++) {
                System.out.print("  ");
            }

            int numero = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(numero + "   ");
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
