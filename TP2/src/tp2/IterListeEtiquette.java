/*
 * @author flavoie Fabien Lavoie Lavf27046702
 *
 * Cette class retourne un itérateur sur des étiquettes. L’utilisateur donne la position d’une case
 * du tableau (indice). L’itérateur va permettre de parcourir toutes les étiquettes qui contiennent cette
 * case dans leur intervalle.
 */
package tp2;

import java.util.ArrayList;
import java.util.Iterator;

public class IterListeEtiquette implements Iterator {

    private ArrayList<Etiquette> _courrant = null;
    private ArrayList _etiquette = null;
    private int pos = 0;

    public IterListeEtiquette(ArrayList a_liste, int par_item) {
        _courrant = new ArrayList<>();
        _etiquette = a_liste;
        int nbEtiquette = _etiquette.size() - 1;
        for (int i = 0; i <= nbEtiquette; ++i) {
            Etiquette eti = (Etiquette) a_liste.get(i);
//            System.out.println(eti.id());
            if (eti.estInclus(par_item)) {
                _courrant.add(eti);
            }
        }
    }

    public boolean hasNext() {
              //validation si nous avons un prochain item
        return pos <= _courrant.size() - 1;
    }

    public Etiquette next() {
        //nous retournons le suivant
        Etiquette element = _courrant.get(pos);
        ++pos;
        return element;
    }
}
