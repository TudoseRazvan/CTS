package Subiect_Chain_Strategy.clase;

import java.util.ArrayList;
import java.util.List;

public class CautarePretMic implements ICautare{
    private double pretMaxim;
    private ICautare urmatorulCriteriu;

    public CautarePretMic(double pretMaxim) {
        this.pretMaxim = pretMaxim;
    }

    @Override
    public List<Produs> filtreaza(List<Produs> produse) {
        List<Produs> rezultat = new ArrayList<>();
        for(Produs produs : produse){
            if(produs.getPret() <= pretMaxim){
                rezultat.add(produs);
            }
        }
        //Trimitere catre urmatorul criteriu daca exista
        if(urmatorulCriteriu != null) {
            return urmatorulCriteriu.filtreaza(rezultat);
        }

        return rezultat;
    }

    @Override
    public void setUrmatorulCriteriu(ICautare urmatorulCriteriu) {
        this.urmatorulCriteriu = urmatorulCriteriu;
    }
}
