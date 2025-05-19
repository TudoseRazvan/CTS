package Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.decorator.clase;

import java.util.ArrayList;
import java.util.List;

public class Cos {
    private final Client client;
    private List<Produs> produse = new ArrayList<>();

    public Cos(Client client, List<Produs> produse) {
        this.client = client;
        this.produse = produse;
    }

    public Client getClient() {
        return client;
    }

    public double getTotalProduse(){
        double total = 0;
        for(Produs produs : produse){
            total += produs.getPret();
        }

        return total;
    }
}
