package poliretos;

public class Recursion {

    /**
     * muestra una recursividad para R01) crear un metodo recursivo para obtener factorial(n)  
     * @return: Integer
     */
         public int calcularFactorial(int factorial) {
            System.out.println();
        if (factorial == 0) {
            return 1;
        } else {
            // Llamada recursiva: n! = n * (n-1)!
            return factorial * calcularFactorial(factorial - 1);
        }    
    }

    /**
     * muestra una recursividad para R06) crear un metodo recursivo para obtener la conteoRegresivo(n)  hasta 0
     */ 
    public void mostrarConteoRecursivo(int numero) {
        System.err.println();
        if (numero >= 0) {
            System.out.println("Conteo: " + numero);
            mostrarConteoRecursivo(numero - 1);
        }  
    }

}
