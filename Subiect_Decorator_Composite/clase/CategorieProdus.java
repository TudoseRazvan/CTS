package Subiect_Decorator_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class CategorieProdus implements IProdus{
    private String denumire;
    private List<IProdus> produse = new ArrayList<>();

    public CategorieProdus(String denumire) {
        this.denumire = denumire;
    }

    public void adaugaProdus(IProdus produs){
        produse.add(produs);
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getNrBucati() {
        return produse.stream().mapToInt(IProdus::getNrBucati).sum();
    }

    @Override
    public double getPret() {
        return produse.stream().mapToDouble(IProdus::getPret).sum();
    }

    @Override
    public void afiseazaDetalii(String indent) {
        System.out.println(indent + "Categorie: " + denumire + " - Total produse: " + getNrBucati());
        for (IProdus produs : produse) {
            produs.afiseazaDetalii(indent + "  ");
        }
    }
}
