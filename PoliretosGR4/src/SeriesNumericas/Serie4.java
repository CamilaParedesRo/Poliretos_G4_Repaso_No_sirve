package SeriesNumericas;

public class Serie4 {
    public void generar(int numeroTerminos) {
        System.out.println("Serie numerica S4:");
        
        int fibonacciUno = 0; // Primer número de la secuencia Fibonacci
        int fibonacciDos = 1; // Segundo número de la secuencia Fibonacci
        int denominador = 2;
        
        for (int i = 0; i < numeroTerminos; i++) {
            System.out.print(fibonacciUno + "/" + denominador + " ");
            
            // Calcula el siguiente número de Fibonacci
            int siguienteFibonacci = fibonacciUno + fibonacciDos;
            fibonacciUno = fibonacciDos;
            fibonacciDos = siguienteFibonacci;
            
            // Incrementa el denominador en 2
            denominador += 2;
        }
        System.out.println();
    }
}
