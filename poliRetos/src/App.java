import java.util.Scanner;

import poli_Retos.Arrays;
import poli_Retos.Cadenas;
import poli_Retos.Figuras;
import poli_Retos.GrafosAutomatas;
import poli_Retos.Loading;
import poli_Retos.Recursion;
import poli_Retos.SecuenciasNumericas;
import poli_Retos.SerieDeCaracteres;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    SecuenciasNumericas serie = new SecuenciasNumericas();
    SerieDeCaracteres serieCaracteres = new SerieDeCaracteres();
    Figuras figuras = new Figuras();
    Cadenas cadena = new Cadenas();
    Arrays array = new Arrays();
    Loading loding = new Loading();
    Recursion r1 = new Recursion();
    Recursion r6 = new Recursion();
    GrafosAutomatas g5 = new GrafosAutomatas();


    serie.G4_SeriesNumericas_S5(scanner);
    Thread.sleep(700); 
    serie.G4_SeriesNumericas_S10(scanner);
    Thread.sleep(700); 
    System.out.println(" ");

    serieCaracteres.G4_SeriesDeCaracteres_SC5(scanner);
    Thread.sleep(700); 
    System.out.println(" ");

    figuras.G4_Figuras_1(scanner);
    Thread.sleep(700); 
    figuras.G4_Figuras_6(scanner);
    Thread.sleep(700); 
    figuras.G4_Figuras_11(scanner);
    Thread.sleep(700); 
    figuras.G4_Figuras_16(scanner);
    Thread.sleep(700); 
    System.out.println(" ");

    cadena.G4_CadenadeCaracteres_2(scanner);
    Thread.sleep(700); 
    cadena.G4_CadenadeCaracteres_7(scanner);
    Thread.sleep(700); 
    System.out.println(" ");

    array.G4_Array_3();
    Thread.sleep(700); 
    System.out.println(" ");

    loding.G4_Loading_3();
    Thread.sleep(700);
    loding.G4_Loading_8(scanner);
    Thread.sleep(700); 
    System.out.println(" ");

    r1.calcularFactorial(0);
    r6.mostrarConteoRecursivo(34);
    g5.mostrarGrafoYAutomata("edad,");

    }
}
