package Subiecte.Subiect_Chain_Strategy.clase;

import java.util.ArrayList;
import java.util.List;

public class CautareMarime implements ICautare{
    private String marime;
    private ICautare urmatorulCriteriu;

    public CautareMarime(String marime) {
        this.marime = marime;
    }

    @Override
    public List<Produs> filtreaza(List<Produs> produse) {
        List<Produs> rezultat = new ArrayList<>();
        for(Produs produs : produse){
            if(produs.getMarime().equals(marime)){
                rezultat.add(produs);
            }
        }

        if(urmatorulCriteriu != null){
            return urmatorulCriteriu.filtreaza(rezultat);
        }

        return rezultat;
    }

    @Override
    public void setUrmatorulCriteriu(ICautare urmatorulCriteriu) {
        this.urmatorulCriteriu = urmatorulCriteriu;
    }
}
