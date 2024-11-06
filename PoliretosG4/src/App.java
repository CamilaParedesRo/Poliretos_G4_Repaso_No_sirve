import java.util.Random;
import java.util.Scanner;

import Poli_Reto.Arreglo;
import Poli_Reto.Automata;
import Poli_Reto.Cadena;
import Poli_Reto.Figura;
import Poli_Reto.Loading;
import Poli_Reto.Recursion;
import Poli_Reto.Secuencia_Caracter;
import Poli_Reto.SerieNumerica;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        SerieNumerica serie= new SerieNumerica();
        Secuencia_Caracter secuencia = new Secuencia_Caracter();
        Figura figura = new Figura();
        Cadena cadena = new Cadena();
        Arreglo arreglo= new Arreglo();
        Loading loading = new Loading();
        Recursion recursion = new Recursion();
        Automata automata= new Automata();

        automata.G4_Automata03(scanner); 
        automata.G4_Automata_3(scanner);
        serie.G4_SerieNumerica_S3(scanner);
        serie.G4_SerieNumerica_S8(scanner);
        secuencia.G4_Secuencia_CaracterS3(scanner);
        secuencia.G4_Secuencia_CaracterS8();
        System.out.println();
        figura.G4_Figura_4( scanner);
        figura.G4_Figura_9(scanner);
        figura.G4_Figura_14(scanner);
        figura.G4_Figura_19(scanner);
        cadena.G4_Cadena_5(scanner);
        arreglo.G4_Areglo_1(scanner);
        loading.G4_Loading_1();
        System.out.println();
        loading.G4_Loading_6();
        System.out.println();
        loading.G4_Loading_11(random);
        recursion.G4_Recursion_4(scanner);
        
        



        

       

        

    }
}
