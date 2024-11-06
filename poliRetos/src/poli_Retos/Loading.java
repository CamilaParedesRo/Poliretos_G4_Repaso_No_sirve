package poli_Retos;

import java.util.Scanner;

public class Loading {

    /**
     * muestra la serie L03) Pedir un caracter que se desplaza de izquierda a derecha en una la barra es de 20 caracteres 
     */
    public void G4_Loading_3() {
        System.out.print("Loading 03");
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

    public void G4_Loading_8( Scanner scanner) {
        System.out.print("Loading 08");
        System.out.println("Ingrese su nombre completo");
        String nombreCompleto = scanner.nextLine();
        int longitudBarra = 20;
        int porcentaje = 0;
        int longitudNombre = nombreCompleto.length();

        for (int i = 0; i < longitudNombre; i++) {
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
