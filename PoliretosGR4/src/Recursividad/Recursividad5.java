package Recursividad;

public class Recursividad5 {

    // Método principal para la recursión
    public void contarProgresivo(int n) {
        conteoProgresivoHasta(n);
    }

    // Método recursivo que imprime de 1 hasta n
    private void conteoProgresivoHasta(int n) {
        // Caso base: si n es 1, simplemente imprimimos 1
        if (n == 1) {
            System.out.println(1);
        } else {
            // Llamada recursiva con un valor reducido (n - 1)
            conteoProgresivoHasta(n - 1);
            // Imprimir el valor de n después de completar las llamadas recursivas
            System.out.println(n);
        }
    }
}
