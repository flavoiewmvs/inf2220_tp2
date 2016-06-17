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
        return pos <= _courrant.size() - 1;
    }

    public Etiquette next() {
        Etiquette element = _courrant.get(pos);
        ++pos;
        return element;
    }
}
