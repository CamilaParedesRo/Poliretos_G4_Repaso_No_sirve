import Start.Grupo4;
import Arrays.Array2;
import Automatas.Automata4;
import CadenasCaracteres.Cadena1;
import CadenasCaracteres.Cadena6;
import Figuras.Figura5;
import Figuras.Figura10;
import Figuras.Figura15;
import Loadings.Loading7;
import Loadings.Loading12;
import Recursividad.Recursividad5;
import SeriesCaracteres.SerieCara4;
import SeriesCaracteres.SerieCara9;
import SeriesNumericas.Serie4;
import SeriesNumericas.Serie9;
import SeriesNumericas.Serie12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Muestra la información del grupo
        Grupo4.mostrarInformacionGrupo();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Arrays");
            System.out.println("2. Autómatas");
            System.out.println("3. Cadenas de Caracteres");
            System.out.println("4. Figuras");
            System.out.println("5. Loadings");
            System.out.println("6. Recursividad");
            System.out.println("7. Series de Caracteres");
            System.out.println("8. Series Numéricas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarArrays(scanner);
                    break;
                case 2:
                    ejecutarAutomatas();
                    break;
                case 3:
                    ejecutarCadenasCaracteres(scanner);
                    break;
                case 4:
                    ejecutarFiguras();
                    break;
                case 5:
                    ejecutarLoadings();
                    break;
                case 6:
                    ejecutarRecursividad();
                    break;
                case 7:
                    ejecutarSeriesCaracteres(scanner);
                    break;
                case 8:
                    ejecutarSeriesNumericas(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void ejecutarArrays(Scanner scanner) {
        System.out.print("Ingrese el tamaño de la letra: ");
        int size = scanner.nextInt();
        System.out.print("Ingrese el carácter para dibujar: ");
        char caracter = scanner.next().charAt(0);
        Array2 array = new Array2();
        array.generarArray(size, caracter);
    }
    

    private static void ejecutarAutomatas() {
        Automata4 automata = new Automata4();
        String[] pruebas = {"123", "12.34", "0.5", ".5", "5.", "abc", "12..34"};
        automata.ejecutar(pruebas);
    }
    

    private static void ejecutarCadenasCaracteres(Scanner scanner) {
        System.out.println("1. Contar vocales en una frase");
        System.out.println("2. Invertir frase en mayúsculas");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    
        if (opcion == 1) {
            System.out.print("Ingrese una frase: ");
            String frase = scanner.nextLine();
            Cadena1 cadena1 = new Cadena1();
            cadena1.contarVocales(frase);
        } else if (opcion == 2) {
            System.out.print("Ingrese una frase: ");
            String frase = scanner.nextLine();
            Cadena6 cadena6 = new Cadena6();
            cadena6.invertirMayusculas(frase);
        } else {
            System.out.println("Opción no válida en Cadenas de Caracteres.");
        }
    }
    

    private static void ejecutarFiguras() {
        Figura5 figura5 = new Figura5();
        figura5.dibujar();

        Figura10 figura10 = new Figura10();
        figura10.dibujar();

        Figura15 figura15 = new Figura15();
        figura15.dibujar();
    }

    private static void ejecutarLoadings() {
        Loading7 loading7 = new Loading7();
        loading7.mostrar();

        Loading12 loading12 = new Loading12();
        loading12.mostrar();
    }

    private static void ejecutarRecursividad() {
        Recursividad5 recursividad5 = new Recursividad5();
        recursividad5.contarProgresivo(5); // Ejemplo de número para recursividad
    }

    private static void ejecutarSeriesCaracteres(Scanner scanner) {
        System.out.print("Ingrese el número de términos: ");
        int numeroTerminos = scanner.nextInt();

        SerieCara4 serieCara4 = new SerieCara4();
        serieCara4.generar(numeroTerminos);

        SerieCara9 serieCara9 = new SerieCara9();
        serieCara9.generar(numeroTerminos);
    }

    private static void ejecutarSeriesNumericas(Scanner scanner) {
        System.out.print("Ingrese el número de términos: ");
        int numeroTerminos = scanner.nextInt();

        Serie4 serie4 = new Serie4();
        serie4.generar(numeroTerminos);

        Serie9 serie9 = new Serie9();
        serie9.generar(numeroTerminos);

        Serie12 serie12 = new Serie12();
        serie12.generar(numeroTerminos);
    }
}
