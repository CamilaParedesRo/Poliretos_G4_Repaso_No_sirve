package Loadings;

public class Loading7 {
    public void mostrar() {
        // Arreglo de caracteres de rotación para la punta de la barra
        char[] rotacion = {'\\', '|', '/', '-'};
        
        // Ciclo para mostrar el progreso
        for (int progreso = 0; progreso <= 20; progreso++) {
            // Calcular el porcentaje actual
            int porcentaje = progreso * 5;

            // Construir la barra de progreso
            String barra = "[";
            for (int i = 0; i < 20; i++) {
                if (i < progreso) {
                    barra += "=";
                } else if (i == progreso) {
                    barra += rotacion[progreso % rotacion.length]; // Símbolo de rotación
                } else {
                    barra += " ";
                }
            }
            barra += "] " + porcentaje + "%";

            // Imprimir la barra y esperar para simular el movimiento
            System.out.print("\r" + barra); // "\r" sobreescribe la línea en consola
            try {
                Thread.sleep(200); // Pausa de 200ms para el efecto de animación
            } catch (InterruptedException e) {
                System.out.println("Proceso interrumpido.");
                return;
            }
        }
        System.out.println("\nProceso completado.");
    }
}
