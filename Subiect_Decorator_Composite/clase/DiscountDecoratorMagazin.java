package Subiect_Decorator_Composite.clase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiscountDecoratorMagazin {
    private Magazin magazin;
    private Set<String> clientiCuDiscount = new HashSet<>();

    public DiscountDecoratorMagazin(Magazin magazin) {
        this.magazin = magazin;
    }

    public double calculeazaTotalPlata(List<Produs> cosCumparaturi, String adresa, String client){
        double total = magazin.calculeazaTotalPlata(cosCumparaturi,adresa);

        //Aplicare discount o singura data pentru client
        if(!clientiCuDiscount.contains(client)){
            total *= 0.9;
            clientiCuDiscount.add(client);
            System.out.println("Discount aplicat pentru clientul: " + client);
        }

        return total;
    }
}
