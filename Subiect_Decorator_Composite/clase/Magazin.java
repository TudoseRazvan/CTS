package Subiect_Decorator_Composite.clase;

import java.util.List;

public class Magazin {
    public double calculeazaTotalPlata(List<Produs> cosCumparaturi, String adresa){
        double total = cosCumparaturi.stream()
                .mapToDouble(Produs::getPret)
                .sum();

        double transportCost = adresa.contains("Bucuresti") ? 10 : 20;

        return total + transportCost;
    }


}
