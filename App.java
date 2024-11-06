
import Poliretos.Array;
import Poliretos.Automatas;
import Poliretos.CadenaDeCaracteres;
import Poliretos.Figuras;
import Poliretos.Loading;
import Poliretos.Recursion;
import Poliretos.SeriesDeCaracteres;
import Poliretos.Seriesnumericas;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Integrantes del grupo:");
        System.out.println("Paredes.Camila");
        System.out.println("Pillajo.Anahi");
        System.out.println("Pinargote.Eliana");
        System.out.println("Rochina.Adayeli");
        
         Scanner scanner = new Scanner(System.in);

        Seriesnumericas serie = new Seriesnumericas( );
        SeriesDeCaracteres serieCaracteres = new SeriesDeCaracteres();
        Figuras figuras = new Figuras();
        CadenaDeCaracteres cadena = new CadenaDeCaracteres();
        Array array = new Array();
        Loading loading = new Loading();
        Recursion recursion = new Recursion();
        Automatas automatas = new Automatas();

        serie.G4_SeriesNumericas_S1(scanner);
        serie.G4_SeriesNumericas_S6(scanner);
        System.out.println(" ");

        serieCaracteres.G4_SeriesDeCaracteres_SC1(scanner);
        serieCaracteres.G4_SeriesDeCaracteres_SC6_1(scanner);
        serieCaracteres.G4_SeriesDeCaracteres_SC6_2(scanner);
        System.out.println(" ");

        figuras.G4_Figuras_2();
        figuras.G4_Figuras_7(scanner);
        figuras.G4_Figuras_12(scanner);
        figuras.G4_Figuras_17();
        System.out.println(" ");

        cadena.G4_CadenadeCaracteres_3(scanner);
        cadena.G4_CadenadeCaracteres_8(scanner);
        System.out.println(" ");

        array.G4_Array_4();
        System.out.println(" ");

        loading.G4_Loading_4();
        loading.G4_Loading_9(scanner);
        System.out.println(" ");

        recursion.G4_Recursion_2();
        System.out.println(" ");

        automatas.G4_Automata_1(scanner);
        automatas.G4_Automata_6(scanner);

    scanner.close();
    }
}
