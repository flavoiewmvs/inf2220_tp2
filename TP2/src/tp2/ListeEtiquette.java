/*
 * @author flavoie Fabien Lavoie Lavf27046702
 */
package tp2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListeEtiquette<E> extends ArrayList<E> implements Iterable<E> {

    private ArrayList<Etiquette> Etiquettes;

    public ListeEtiquette() {
        super();
        Etiquettes = new ArrayList<Etiquette>();
    }

    public void ajouterEtiquette(Etiquette a_etiquette) {
//Cette méthode va permettre d’ajouter une étiquette à la structure. Il n’y a pas de règle pour ces
//étiquettes. Elles seront considéré comme valide, peu importe leurs contenu.
        Etiquettes.add(a_etiquette);
    }

    public void supprimerEtiquette(Etiquette a_etiquette) {
//Cette méthode permet de supprimer une étiquette de la structure. Utiliser equals() pour trouver
//l’étiquette à supprimer. Une seule étiquette est supprimée. Donc, s’il y a plusieurs étiquettes
//similaires, une seule de ces étiquettes est supprimée.
        Etiquettes.remove(a_etiquette);
    }

    public void supprimerEtiquettes(String a_id) {
//Cette méthode permet de supprimer plusieurs étiquettes. Toutes les étiquettes ayant le même id
//sont supprimées.
        ArrayList _etiquette = null;
        _etiquette = this.getEtiquette();
        int nbEtiquette = _etiquette.size() - 1;
        for (int i = nbEtiquette; i >= 0; --i) {
            Etiquette eti = (Etiquette) _etiquette.get(i);
            if (a_id == eti.id()) {
                supprimerEtiquette(eti);
            }
        }
    }

    public ArrayList<Etiquette> getEtiquette() {
        return Etiquettes;
    }

    public Iterator<Etiquette> iterator(int a_position) {
//        Iterator<Etiquette> 
//Cette méthode retourne un itérateur sur des étiquettes. L’utilisateur donne la position d’une case
//du tableau (indice). L’itérateur va permettre de parcourir toutes les étiquettes qui contiennent cette
//case dans leur intervalle.
// liste les etiquette relier a cette case
//      System.out.println(" ds it int a_position ...........");
        return new IterListeEtiquette(Etiquettes, a_position);
    }

    public Iterator<E> iterator(String a_id) {
//Finalement, cette méthode va retourner un iterateur qui parcours les cases du tableau d’éléments.
//Par contre, seule les cases qui font partie d’un intervalle ayant l’id indiqué seront parcourues.
//Même si une case est contenue dans plusieurs intervalles, elle ne sera parcourue qu’une seule fois.
//Les cases doivent être parcourues dans le même ordre que nous les retrouvons dans le tableau.
//Iterator iter = this.iterator();
//retourne tus les case qui sont lier a cette etiuqette
//        System.out.println(" ds it string a_id ...........");
        return new IterListeItem<E>(this, a_id);

    }
}
