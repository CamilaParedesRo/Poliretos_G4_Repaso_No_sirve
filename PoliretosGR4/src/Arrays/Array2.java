package Arrays;

public class Array2 {
    // Método que dibuja las iniciales E y P
    public void generarArray(int tamano, char caracter) {
        System.out.println("\nMatriz de iniciales:");
        dibujarE(tamano, caracter);
        System.out.println(); // Espacio entre las letras
        dibujarP(tamano, caracter);
    }

    public static void dibujarE(int tamano, char caracter) {
        // Dibuja la letra "E" usando el tamaño y carácter dados
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == 0 || i == tamano / 2 || i == tamano - 1 || j == 0) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void dibujarP(int tamano, char caracter) {
        // Dibuja la letra "P" usando el tamaño y carácter dados
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == 0 || i == tamano / 2 || j == 0 || (j == tamano - 1 && i < tamano / 2)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
