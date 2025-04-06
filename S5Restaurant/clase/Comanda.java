package S5Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int numarComanda;
    private List<Preparat> preparate;
    private String numeClient;

    public Comanda(int numarComanda, String numeClient) {
        this.numarComanda = numarComanda;
        this.numeClient = numeClient;
        this.preparate = new ArrayList<>();
    }

    public void adaugaPreparat(Preparat preparat) {
        preparate.add(preparat);
    }

    public List<Preparat> getPreparate() {
        return preparate;
    }

    public int getNumarComanda() {
        return numarComanda;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void afiseazaDetaliiComanda() {
        System.out.println("\nComanda #" + numarComanda + " pentru clientul " + numeClient);
        System.out.println("Preparate comandate:");

        for (Preparat preparat : preparate) {
            System.out.println("- " + preparat.getDenumire() + " (timp: " + preparat.getTimpGatire() +
                    " min, grade: " + preparat.getGradeNecesare() + "°C)");
        }
    }
}
