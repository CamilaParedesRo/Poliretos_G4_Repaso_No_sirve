package poliretos;

public class Figuras {
    /**
    muestra la figura F1:
    * * * * *
    *       *
    *       *  
    *       *           
    * * * * *
    */
    public void mostrarFigura1(int numeroNiveles) {
        System.out.println();
        for (int i = 0; i < numeroNiveles; i++) {
            for (int j = 0; j < numeroNiveles; j++) {
                if (i == 0 || i == numeroNiveles - 1 || j == 0 || j == numeroNiveles - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacio para el interior
                }
            }
            System.out.println();
        }
    }

    /**
     * muestra la figura F6:	
		     *
		    ***
		   *****                    
		  *******
		 ********* 
     */
    public void mostrarFigura6(int numeroNiveles) {
        System.out.println();
        for (int filas = numeroNiveles; filas > 0; filas--) {
            for (int espacio = 0; espacio < filas; espacio++) {
                System.out.print(" ");
            }
            for (int nroCaracteres = numeroNiveles; nroCaracteres >= filas; nroCaracteres--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     /**
     * muestra la figura F11:	
            | _ 
               | _ _
                    | _ _ _
                           | _ _ _ _            
                                    | _ _ _ _ _
     */  
    public void mostrarFigura11(int numeroNiveles) {
        System.out.println();
        StringBuilder caracteres = new StringBuilder("|");
        StringBuilder espacios = new StringBuilder(""); 
        StringBuilder addespacios = new StringBuilder("   ");
        for (int filas = 0; filas < numeroNiveles; filas++){
            System.out.println(caracteres.append(" _"));
            System.out.print(espacios.append(addespacios));
            addespacios.append("  ");
        }
    }

    /**
     * muestra la figura F16:
            +				+
                -		-
                    +                       
                -		-
            +				+
            ....
     */
    public void mostrarFigura16(int numeroNiveles) {
        System.out.println();
        for (int i = 0; i < numeroNiveles; i++) {
            for (int j = 0; j < numeroNiveles; j++) {
                if (i==j || i==numeroNiveles-1-j) {
                    if (i%2==0 && j%2==0) {
                        System.out.print("- ");
                    }
                    else
                        System.out.print("+ ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }    
    }

}
