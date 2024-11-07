package Loadings;

public class Loading12 {
    public void mostrar() {
        // Definimos cada línea de la figura en un arreglo de cadenas
        String[] figura = {
            "    \\|||//     ",
            "     (> <)      ",
            "  ooO-(_)-Ooo   "
        };

        int espaciosMaximos = 20; // Máximo de espacios a mover a la derecha
        int pausa = 200; // Tiempo de espera entre movimientos en milisegundos

        // Bucle para mover la figura hacia la derecha
        for (int i = 0; i <= espaciosMaximos; i++) {
            mostrarFigura(figura, i);
            try {
                Thread.sleep(pausa); // Pausa para crear el efecto de animación
            } catch (InterruptedException e) {
                System.out.println("Proceso interrumpido.");
                return;
            }
        }

        // Bucle para mover la figura de regreso hacia la izquierda
        for (int i = espaciosMaximos; i >= 0; i--) {
            mostrarFigura(figura, i);
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                System.out.println("Proceso interrumpido.");
                return;
            }
        }
    }

    // Método para imprimir la figura con una cantidad específica de espacios al inicio
    private void mostrarFigura(String[] figura, int espacios) {
        System.out.println("\033[H\033[2J"); // Limpiar consola (no siempre funciona en todos los sistemas)

        for (String linea : figura) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            System.out.println(linea);
        }
    }
}
