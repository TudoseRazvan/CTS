package Subiecte.Subiect_Chain_Strategy.clase;

import java.util.ArrayList;
import java.util.List;

public class CautareCuloare implements ICautare{
    private String culoare;
    private ICautare urmatorulCriteriu;

    public CautareCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public List<Produs> filtreaza(List<Produs> produse) {
        List<Produs> rezultat = new ArrayList<>();
        for(Produs produs:produse){
            if(produs.getCuloare().equals(culoare)) {
                rezultat.add(produs);
            }
        }

        if(urmatorulCriteriu!=null){
            return urmatorulCriteriu.filtreaza(rezultat);
        }

        return rezultat;
    }

    @Override
    public void setUrmatorulCriteriu(ICautare urmatorulCriteriu) {
        this.urmatorulCriteriu = urmatorulCriteriu;
    }
}
