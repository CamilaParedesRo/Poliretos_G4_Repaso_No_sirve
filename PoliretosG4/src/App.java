import java.util.Random;
import java.util.Scanner;

import Poli_Reto.Arreglo;
import Poli_Reto.Automata;
import Poli_Reto.Cadena;
import Poli_Reto.Figura;
import Poli_Reto.Loading;
import Poli_Reto.Recursion;
import Poli_Reto.Secuencia_Caracter;
import Poli_Reto.Serie_Numerica;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Serie_Numerica serie = new Serie_Numerica(); 
        Secuencia_Caracter secuencia = new Secuencia_Caracter();
        Figura figura = new Figura();
        Cadena cadena = new Cadena();
        Arreglo arreglo= new Arreglo();
        Loading loading = new Loading();
        Recursion recursion = new Recursion();
        Automata automata= new Automata();

        automata.Automata03(scanner);
        automata.Automata3(scanner);
        serie.SerieS3(scanner);
        serie.SerieS8(scanner);
        secuencia.Secuencia_CaracterS3(scanner);
        secuencia.Secuencia_CaracterS8();
        System.out.println();
        figura.Figura4(scanner);
        System.out.println();
        figura.Figura14(scanner);
        figura.Figura19(scanner);
        figura.Figura09(scanner);
        recursion.Recursion04(scanner);
        cadena.Cadena05(scanner);
        arreglo.Areglo01(scanner);
        loading.Loading01();
        System.out.println();
        loading.Loading06();
        System.out.println();
        loading.Loading11(random);
        
        

       

        

    }
}
