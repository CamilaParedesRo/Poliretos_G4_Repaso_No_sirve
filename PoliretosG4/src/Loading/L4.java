package Loading;
/* 
    Waiting que inicia en 0  a 100% usar los signos o0o para simular un 
    movimiento de ida y vuelta en el mismo puesto   
        o0o 100% 
*/
public class L4 {
    public void animacion() {
        try {
            for (int i = 0; i <= 100; i += 10) { 
                System.out.print("\r");
                if ( (i / 10) % 2 == 0 ){
                    System.out.print(  "o0o" + " " + i + "%");
                }else{
                    System.out.print(  "0o0" + " " + i + "%");
                }
                Thread.sleep(700); 
            }
            System.out.println("\r Cargando siguiente pantalla ... Espere ");
        } catch (InterruptedException e) {
            System.out.println("La señal esta siendo interrumpida");
        }
    }
}

