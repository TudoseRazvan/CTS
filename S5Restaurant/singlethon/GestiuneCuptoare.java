package S5Restaurant.singlethon;

import S5Restaurant.clase.Cuptor;
import S5Restaurant.clase.Preparat;

import java.util.ArrayList;
import java.util.List;

public class GestiuneCuptoare {
    private static GestiuneCuptoare instance = null;
    private List<Cuptor> cuptoare;

    private GestiuneCuptoare() {
        this.cuptoare = new ArrayList<>(); //instanta Singleton isi gestioneze singura lista.
    }

    public static synchronized GestiuneCuptoare getInstance() {
        if (instance == null) {
            instance = new GestiuneCuptoare();
        }
        return instance;
    }

    public void adaugaCuptor(Cuptor cuptor) {
        cuptoare.add(cuptor);
        System.out.println("Cuptorul " + cuptor.getDenumire() + " a fost adăugat în gestiune.");
    }

    public void asigneazaPreparatOptim(Preparat preparat) {
        if (cuptoare.isEmpty()) {
            System.out.println("Nu există cuptoare disponibile pentru preparatul " + preparat.getDenumire());
            return;
        }

        Cuptor cuptorOptim = null;
        int timpMinim = Integer.MAX_VALUE;

        for (Cuptor cuptor : cuptoare) {
            if (cuptor.getGradeCuptor() >= preparat.getGradeNecesare() && cuptor.getTimpTotal() < timpMinim) {
                timpMinim = cuptor.getTimpTotal();
                cuptorOptim = cuptor;
            }
        }

        if (cuptorOptim != null) {
            cuptorOptim.adaugaPreparat(preparat);
        } else {
            System.out.println("Nu există cuptor disponibil pentru " + preparat.getDenumire() +
                    " (necesită " + preparat.getGradeNecesare() + "°C)");
        }
    }

    public void afiseazaToateCuptoarele() {
        System.out.println("\n=== STAREA TUTUROR CUPTOARELOR ===");
        for (Cuptor cuptor : cuptoare) {
            cuptor.afiseazaListaAsteptare();
            System.out.println("-----------------------------------");
        }
    }
}
