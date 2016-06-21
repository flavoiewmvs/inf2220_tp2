/*
 * @author flavo Fabien Lavoie Lavf27046702
 */
package tp2;

import java.util.*;

/**
 *
 * @author flavo
 */
public class mainTP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        TestListeEtiquette T = new TestListeEtiquette();
//        T.test();
        ListeEtiquette<Integer> LE = new ListeEtiquette<>();
        ListeEtiquette<Integer> LE1 = new ListeEtiquette<>();
        LE.add(7);
        LE.add(2);
        LE.add(3);
        LE.add(4);
        LE.add(5);
        LE.add(7);
        LE.add(4);
        LE.add(0);
        LE.add(3);

        LE1.add(7);
        LE1.add(2);
        LE1.add(3);
        LE1.add(4);

        Etiquette e1 = new Etiquette("test", 1, 5);
        Etiquette e2 = new Etiquette("t2", 5, 7);
        Etiquette e3 = new Etiquette("test", 4, 5);
        Etiquette e4 = new Etiquette("test", 8, 8);
        Etiquette e5 = new Etiquette("t5", 5, 7);
        Etiquette e6 = new Etiquette("t6", 5, 7);
        LE.ajouterEtiquette(e1);
        LE.ajouterEtiquette(e2);
        LE.ajouterEtiquette(e3);
        LE.ajouterEtiquette(e4);
        LE.ajouterEtiquette(e5);
        LE.ajouterEtiquette(e6);
//        LE1.ajouterEtiquette(e1);
//        LE1.ajouterEtiquette(e2);
//         Iterator<Integer> it = LE.iterator();
        Iterator itr1 = LE.iterator("test");
        while (itr1.hasNext()) {
            Object element = itr1.next();
            System.out.print(element + " ");
        }
        System.out.println();
        Iterator itr2 = LE.iterator(8);
        while (itr2.hasNext()) {
            Etiquette element = (Etiquette) itr2.next();
            System.out.println(element.id() + " ");
        }
        LE.supprimerEtiquettes("test");

        itr1 = LE.iterator("test");
        while (itr1.hasNext()) {
            Object element = itr1.next();
            System.out.print(element + " ");
        }

        System.out.println("Fin normal ");
    }

}
