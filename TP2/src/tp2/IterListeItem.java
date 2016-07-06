/*
 * @author flavoie Fabien Lavoie Lavf27046702
 *
 * cette class va retourner un iterateur qui parcours les cases du tableau d’éléments.
 * Par contre, seule les cases qui font partie d’un intervalle ayant l’id indiqué seront parcourues.
 * Même si une case est contenue dans plusieurs intervalles, elle ne sera parcourue qu’une seule fois.
 * Les cases doivent être parcourues dans le même ordre que nous les retrouvons dans le tableau.
 */
package tp2;

import java.util.ArrayList;
import java.util.Iterator;

public class IterListeItem<S> implements Iterator<S> {

    private ArrayList<S> _courrant = null;
    private ArrayList _etiquette = null;
    private int pos = 0;

    public IterListeItem(ListeEtiquette<S> a_liste) {
        _courrant = a_liste;
    }

    public IterListeItem(ListeEtiquette<S> a_liste, String par_id) {
        _courrant = new ArrayList<>();
        _etiquette = a_liste.getEtiquette();
        int nbEtiquette = _etiquette.size() - 1;
        boolean fait = false;
        for (int j = 0; j <= a_liste.size() - 1; ++j) {
            fait = false;
            for (int i = 0; !fait && i <= nbEtiquette; ++i) {
                Etiquette eti = (Etiquette) _etiquette.get(i);
                if (par_id == eti.id() && eti.estInclus(j)) {
                    fait = true;
                    _courrant.add(a_liste.get(j));
                }
            }
        }
    }

  
    public boolean hasNext() {
        //validation si nous avons un prochain item
        return pos <= _courrant.size() - 1;
    }

    public S next() {
        //nous retournons le suivant
        S element = _courrant.get(pos);
        ++pos;
        return element;
    }
}
