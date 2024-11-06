import Poli_Retos.Array;
import Poli_Retos.Automata;
import Poli_Retos.CadenaDeCaracteres;
import Poli_Retos.Figura;
import Poli_Retos.Loading;
import Poli_Retos.Recursion;
import Poli_Retos.SeriesDeCaracteres;
import Poli_Retos.Seriesnumerica;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Integrantes del grupo:");
        System.out.println("Paredes.Camila");
        System.out.println("Pillajo.Anahi");
        System.out.println("Pinargote.Eliana");
        System.out.println("Rochina.Adayeli");
        System.out.println(" ");
        Thread.sleep(500); 

        
         Scanner scanner = new Scanner(System.in);

        Seriesnumerica serie = new Seriesnumerica( );
        SeriesDeCaracteres serieCaracteres = new SeriesDeCaracteres();
        Figura figuras = new Figura();
        CadenaDeCaracteres cadena = new CadenaDeCaracteres();
        Array array = new Array();
        Loading loading = new Loading();
        Recursion recursion = new Recursion();
        Automata automatas = new Automata();

        serie.G4_SeriesNumericas_S1(scanner);
        Thread.sleep(700); 
        serie.G4_SeriesNumericas_S6(scanner);
        Thread.sleep(700); 
        System.out.println(" ");

        serieCaracteres.G4_SeriesDeCaracteres_SC1(scanner);
        Thread.sleep(700); 
        serieCaracteres.G4_SeriesDeCaracteres_SC6_1(scanner);
        Thread.sleep(700); 
        serieCaracteres.G4_SeriesDeCaracteres_SC6_2(scanner);
        Thread.sleep(700); 
        System.out.println(" ");

        figuras.G4_Figuras_2();
        Thread.sleep(700); 
        figuras.G4_Figuras_7(scanner);
        Thread.sleep(700); 
        figuras.G4_Figuras_12(scanner);
        Thread.sleep(700); 
        figuras.G4_Figuras_17();
        Thread.sleep(700); 
        System.out.println(" ");

        cadena.G4_CadenadeCaracteres_3(scanner);
        Thread.sleep(700); 
        cadena.G4_CadenadeCaracteres_8(scanner);
        Thread.sleep(700); 
        System.out.println(" ");

        array.G4_Array_4();
        Thread.sleep(700); 
        System.out.println(" ");


        loading.G4_Loading_4();
        Thread.sleep(700); 
        loading.G4_Loading_9(scanner);
        Thread.sleep(700); 
        System.out.println(" ");

        recursion.G4_Recursion_2();
        Thread.sleep(700); 
        System.out.println(" ");

        automatas.G4_Automata_1(scanner);
        Thread.sleep(700); 
        automatas.G4_Automata_6(scanner);
        Thread.sleep(700); 


    scanner.close();
    }
}
