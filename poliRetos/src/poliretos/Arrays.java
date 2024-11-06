package poliretos;

public class Arrays {

     /**
     *muestra la serie A03) Dibujar un plano de coordenadas positivo y graficar f(x) = 2x usando como caracteres las letras de su nombre
     */
    public void mostrarArreglo3() {
        System.out.println();
        int guion = 45; // Guion
        for (int i=12; i>0; i--){
            if(i==12){
                System.out.println(i + " |               y");
            }
            if(i==10){
                System.out.println(i+ " |            e");
            }
            if(i==8){
                System.out.println(i+ "  |         l");
            }
            if(i==6){
                System.out.println(i+ "  |      r");
            }
            if(i==4){
                System.out.println(i+ "  |   a");
            }
            if(i==2){
                System.out.println(i+ "  |m");
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

}
