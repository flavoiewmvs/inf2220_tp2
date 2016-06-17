/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author flavo
 */
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
        return pos <= _courrant.size() - 1;
    }

    public S next() {
        S element = _courrant.get(pos);
        ++pos;
        return element;
    }
}
