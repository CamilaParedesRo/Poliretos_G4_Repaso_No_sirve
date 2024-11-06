public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

falta la secuencia 5
        /**
     * <b>showSerie10For</b> muestra la serie usando el ciclo for S10: 3, 9, 27, 81, 243, 729, 2187, ...
     * @author: Matheus Velasco 
     * @param nroTerminos: numero de terminos para la serie
     * showSerie10For 
     */    
    public void showSerie10For(int NroTerminos) {
        System.out.println();
        for (int i = 1, serie = 3; i <= NroTerminos; i++, serie *= 3) {
            System.out.print(serie+", ");
        }
    }


     /**
     * <b>showSerie5For</b> muestra la serie usando el ciclo for S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
     * @author: Mateo Simbaña
     * @param nroTerminos: numero de terminos para la serie
     * showSerie5For 
     */
    public void showSerie5For (int nroTerminos){
        String [] patron;
        patron = new String[] {"\\","|","/"," -"," | "};
        System.out.println();
        for (int i = 0; i < nroTerminos; i++) {
            System.out.print(patron[i%5] + " ");
        }
    }

 /**
     * <b>showFigura1For</b> muestra la figura usando el ciclo for F1:
        * * * * *
        *       *
        *       *  
        *       *           
        * * * * *
     * @author: David Unaucho
     * @param nroNiveles: numero de niveles para la figura
     * showFigura1For 
     */
    public  void showFigura1For(int nroNiveles) {
        for (int i = 0; i < nroNiveles; i++) {
            for (int j = 0; j < nroNiveles; j++) {
                if (i == 0 || i == nroNiveles - 1 || j == 0 || j == nroNiveles - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacio para el interior
                }
            }
            System.out.println();
        }
    }
     /**
     * <b>showFigura6For</b> muestra la figura usando el ciclo for F6:	
		     *
		    ***
		   *****                    
		  *******
		 *********
     * @author: Mateo Simbaña
     * @param nroNiveles: numero de niveles para la figura
     * showFigura6For 
     */
    public void showFigura6For(int nroNiveles){
        System.out.println();
        for (int filas = nroNiveles; filas > 0; filas--) {
            for (int espacio = 0; espacio < filas; espacio++) {
                System.out.print(" ");
            }
            for (int nroCaracteres = nroNiveles; nroCaracteres >= filas; nroCaracteres--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
     * <b>showFigura11For</b> muestra la figura usando el ciclo for F11:	
            | _ 
               | _ _
                    | _ _ _
                           | _ _ _ _            
                                    | _ _ _ _ _
     * @author: Mateo Simbaña 
     * @param nroNiveles: numero de niveles para la figura
     * showFigura11For
     */  
    public void showFigura11For (int nroNiveles){
        StringBuilder caracteres = new StringBuilder("|");
        StringBuilder espacios = new StringBuilder(""); 
        StringBuilder addespacios = new StringBuilder("   ");
        for (int filas = 0; filas < nroNiveles; filas++){
            System.out.println(caracteres.append(" _"));
            System.out.print(espacios.append(addespacios));
            addespacios.append("  ");
        }
    }
    /**
     * <b>showFigura16For</b> muestra la figura usando el ciclo for F16:
            +				+
                -		-
                    +                       
                -		-
            +				+
            ....
     * @author: Francisco Negrete          
     * @param nroNiveles: numero de niveles para la figura
     * showFigura16For 
     */



    /**
     * <b>showFrase2For</b> muestra el número de letras de una cadena usando el ciclo for C02) Pedir una frase y contador las letras. 
     * @author: David Unaucho
     * @param frase: frase para contar las letras 
     * showFrase2For
     */
    public void showFrase2For(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                contador++;
            }
        }
        System.out.println("La frase tiene " + contador + " letras.");
    }

    
    /**
     * <b>showFrase7For</b> muestra la cadena usando el ciclo foreach C07: Pedir una frase y presentarla en mayusculas y sin la J.
     * @author: Mateo Simbaña
     * @param frase: frase para presentarla en mayúsculas y sin la J 
     * showFrase7For
     */
    public void showFrase7For (String frase){
        char [] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (char fraseInvertida : fraseCaracteres) {
            if (fraseInvertida != 'j')
                System.out.print(Character.toUpperCase(fraseInvertida));
            }
    } 


     /**
     * <b>Array3</b> muestra la serie A03) Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como caracteres las letras de su nombre
     * @author: Edison Vera
     * Array3
     */
    public void Array3(){
        int guion = 45; // Guion
        for (int i=12; i>0; i--){
            if(i==12){
                System.out.println(i + " |               n");
            }
            if(i==10){
                System.out.println(i+ " |            o");
            }
            if(i==8){
                System.out.println(i+ "  |         s");
            }
            if(i==6){
                System.out.println(i+ "  |      i");
            }
            if(i==4){
                System.out.println(i+ "  |   d");
            }
            if(i==2){
                System.out.println(i+ "  |e");
            }
            if(i % 2 !=0){
                if(i>9){
                    System.out.println(i + " |");
                }
                else{
                    System.out.println(i + "  |");
                }
            }
            
        }
        System.out.print("   ");
        for(int j=0; j<18; j++){
            System.out.print((char)guion);
        }
        System.out.println();
    }
     /**
     * <b>showLoading3</b> muestra la serie usando el ciclo for L03) Pedir un caracter que se desplaza de izquierda a derecha en una la barra es de 20 caracteres 
     * @author: Francisco Negrete
     * showLoading3
     */
    public void showLoading3(){
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

    l8 falta

    /**
     * <b>calcularFactorial</b> muestra una recursividad para R01) crear un metodo recursivo para obtener factorial(n)  
     * @author: Edison Vera
     * @param num1: Calcula el factorial de ese número
     * @return: Integer
     * calcularFactorial
     */
    public long calcularFactorial(int n) {
        // Caso base: factorial de 0 es 1
        if (n == 0) {
            return 1;
        } else {
            // Llamada recursiva: n! = n * (n-1)!
            return n * calcularFactorial(n - 1);
        }
    }
    /**
     * <b>conteoRegresivoRecursivo</b> muestra una recursividad para R06) crear un metodo recursivo para obtener la conteoRegresivo(n)  hasta 0
     * @author: Estefano Santacruz
     * @param n: Número hasta desde el cual empieza el conteo regresivo
     * conteoRegresivoRecursivo
     */  
    public void conteoRegresivoRecursivo(int n) {
        if (n >= 0) {
            System.out.println("Conteo: " + n);
            conteoRegresivoRecursivo(n - 1);
        }
    }

}

