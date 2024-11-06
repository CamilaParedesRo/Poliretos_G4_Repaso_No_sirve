package poliretos;

public class Loading {

    /**
     * muestra la serie L03) Pedir un caracter que se desplaza de izquierda a derecha en una la barra es de 20 caracteres 
     */
    public void mostrarLoadingl3() {
        System.out.println();
        int longitudBarra = 20;
        int porcentaje = 0;
        while (porcentaje <= 100) {
            System.out.print("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i == (porcentaje * longitudBarra / 100)) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
            porcentaje++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void mostrarLoadingl8( String nombreCompleto) {
        System.out.println();
        int longitudBarra = 20;
        int porcentaje = 0;
        int longitudNombre = nombreCompleto.length();

        for (int i = 0; i < longitudNombre; i++) {
            char letraActual = nombreCompleto.charAt(i);
            porcentaje = (i + 1) * 100 / longitudNombre;

            System.out.print("\r[");
            System.out.print(nombreCompleto.substring(0, i + 1));
            for (int j = i + 1; j < longitudBarra; j++) {
                System.out.print(" ");
            }
            System.out.print("] " + porcentaje + "%");

            try {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\r[" + nombreCompleto + "] 100%");
    }

}
