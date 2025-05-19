package Subiecte.Subiect_Chain_Strategy.clase;

import java.util.ArrayList;
import java.util.List;

public class MagazinPantofi {
    private List<Produs> produse = new ArrayList<>();

    public void adaugaProdus(Produs produs){
        produse.add(produs);
    }

    public List<Produs> cautaProduse(ICautare cautare){
        if(cautare == null){
            return produse;
        }
        return cautare.filtreaza(produse);
    }
}
