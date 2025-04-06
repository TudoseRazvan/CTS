package S5Restaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private String denumire;
    private int gradeCuptor;
    private int timpTotal;
    private List<Preparat> listaAsteptare;

    public Cuptor(String denumire, int gradeCuptor) {
        this.denumire = denumire;
        this.gradeCuptor = gradeCuptor;
        this.timpTotal = 0;
        this.listaAsteptare = new ArrayList<>();
    }

    public void adaugaPreparat(Preparat preparat) {
        if (preparat.getGradeNecesare() <= this.gradeCuptor) {
            listaAsteptare.add(preparat);
            timpTotal += preparat.getTimpGatire();
            System.out.println("Preparatul " + preparat.getDenumire() + " a fost adăugat în lista de așteptare a cuptorului " + denumire);
        } else {
            System.out.println("Preparatul " + preparat.getDenumire() + " nu poate fi gătit în cuptorul " + denumire +
                    " deoarece necesită " + preparat.getGradeNecesare() + " grade, iar cuptorul suportă maxim " +
                    gradeCuptor + " grade.");
        }
    }

    public void afiseazaListaAsteptare() {
        System.out.println("\nLista de așteptare pentru cuptorul " + denumire + ":");
        if (listaAsteptare.isEmpty()) {
            System.out.println("Nu există preparate în așteptare.");
        } else {
            for (Preparat preparat : listaAsteptare) {
                System.out.println("- " + preparat.getDenumire() + " (timp: " + preparat.getTimpGatire() +
                        " min, grade: " + preparat.getGradeNecesare() + "°C)");
            }
            System.out.println("Timp total de așteptare: " + timpTotal + " minute");
        }
    }

    public String getDenumire() {
        return denumire;
    }

    public int getGradeCuptor() {
        return gradeCuptor;
    }

    public int getTimpTotal() {
        return timpTotal;
    }
}
