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
               
       for (Integer I : LE) {
           System.out.println(">>"+I);
                   
       }
    }
    
}
