import poliretos.Arrays;
import poliretos.Cadenas;
import poliretos.Figuras;
import poliretos.GrafosAutomatas;
import poliretos.Loading;
import poliretos.Recursion;
import poliretos.SecuenciasNumericas;
import poliretos.SerieCaracteres;

public class App {
    public static void main(String[] args) throws Exception {
    SecuenciasNumericas s5 = new SecuenciasNumericas();
    SecuenciasNumericas s10 = new SecuenciasNumericas();
    SerieCaracteres s05 = new SerieCaracteres();
    Figuras f1 = new Figuras();
    Figuras f6 = new Figuras();
    Figuras f11 = new Figuras();
    Figuras f16 = new Figuras();
    Cadenas c2 = new Cadenas();
    Cadenas c7 = new Cadenas();
    Arrays a3 = new Arrays();
    Loading l3 = new Loading();
    Loading l8 = new Loading();
    Recursion r1 = new Recursion();
    Recursion r6 = new Recursion();
    GrafosAutomatas g5 = new GrafosAutomatas();


    s5.mostrarSecuencia5();
    s10.mostrarSecuencia(3);
    s05.mostrarCaracteres(20);
    f1.mostrarFigura1(5);
    f6.mostrarFigura6(6);
    f11.mostrarFigura11(6);
    f16.mostrarFigura16(6);
    c2.mostrarCadena2("Hola como estas hoy Adayely");
    c7.mostrarCadena7("Adayely tiene muchos pendientes, pero se va a jugar");
    a3.mostrarArreglo3();
    l3.mostrarLoadingl3();
    l8.mostrarLoadingl8("Adayely Rochina");
    r1.calcularFactorial(0);
    r6.mostrarConteoRecursivo(34);
    g5.mostrarGrafoYAutomata("edad,");

    }
}
