/*
 * @author flavo Fabien Lavoie Lavf27046702
 */
package tp2;

/**
 *
 * @author flavo
 */
public class mainTP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListeEtiquette<Integer> LE = new ListeEtiquette<>();
        LE.add(7);
        LE.add(2);
        LE.add(3);
        LE.add(4);
        LE.add(5);
        LE.add(7);
        LE.add(4);
        LE.add(0);
        LE.add(3);
        LE.iterator((String) "1");
        Etiquette e1 = new Etiquette("test", 1, 3);
        Etiquette e2 = new Etiquette("t2", 5, 7);
        Etiquette e3 = new Etiquette("test", 8, 8);
        LE.ajouterEtiquette(e1);
        LE.ajouterEtiquette(e3);
        LE.ajouterEtiquette(e2);
        for (Integer I : LE) {
            System.out.println(">>" + I);

        }
        LE.iterator("test");
 
    }

}
