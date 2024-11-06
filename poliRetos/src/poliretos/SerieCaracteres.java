package poliretos;

public class SerieCaracteres {
    //muestra la serie S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
    public void mostrarCaracteres(int numeroDeTerminos) {
        System.out.println();
        String [] patron;
        patron = new String[] {"\\","|","/"," -"," | "};
        System.out.println();
        for (int i = 0; i < numeroDeTerminos; i++) {
            System.out.print(patron[i%5] + " ");
        }
       
    }

}
