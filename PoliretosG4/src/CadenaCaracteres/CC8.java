package CadenaCaracteres;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Anagramas de palabras.  
        Se forman cuando se utilizan todas las letras de una palabra pero 
modificando el orden. 
        Mostrar una palabra de un conjunto y solicita que ingrese el Anagramas de 
esa palabra. 
        Si falla a la tercera mostrar la respuesta 
            Ejemplo, palabra : delira 
                     salida  : lidera  
        conjunto = {delira, lidera, Ballena: llenaba, Alondra, Ladrona, España, 
apañes, Enrique, quieren} 
*/
public class CC8 {

       public void cadena8() {

        int maxIntentos = 3;
        Map<String, String> palabraConSuAnagrama = new HashMap<>();
        palabraConSuAnagrama.put("delira", "lidera");
        palabraConSuAnagrama.put("ballena", "llenaba");
        palabraConSuAnagrama.put("alondra", "ladrona");
        palabraConSuAnagrama.put("españa", "apanes");
        palabraConSuAnagrama.put("enrique", "quieren");

        System.out.println("Las palabras son: " + palabraConSuAnagrama.keySet());
        System.out.println("Ingresa una palabra y su anagrama correspondiente:");
        Scanner scanner = new Scanner(System.in);
        boolean acierto = false;

        for (int intentos = 1; intentos <= maxIntentos; intentos++) {
            System.out.print("Ingrese la palabra: ");
            String palabra = scanner.nextLine().toLowerCase();
            System.out.print("Ingrese el anagrama: ");
            String anagramaIntento = scanner.nextLine().toLowerCase();

            if (palabraConSuAnagrama.containsKey(palabra) && 
                anagramaIntento.equalsIgnoreCase(palabraConSuAnagrama.get(palabra))) {
                acierto = true;
                System.out.println("¡Correcto! El anagrama de " + palabra + " es " + anagramaIntento);
                break;
            } else {
                System.out.println("Incorrecto.");
            }
        }

        if (!acierto) {
            System.out.println("Lo siento, has fallado tres veces. Aquí están los anagramas correctos:");
            for (Map.Entry<String, String> entrada : palabraConSuAnagrama.entrySet()) {
                System.out.println("Palabra: " + entrada.getKey() + " -> Anagrama: " + entrada.getValue());
            }
        }

        scanner.close();
    }
       
}