package Recapitulare.SingletonCuptor.program;

import Recapitulare.SingletonCuptor.clase.Cuptor;
import Recapitulare.SingletonCuptor.clase.Preparat;

public class Main {
    public static void main(String[] args) {
        Cuptor cuptor = Cuptor.getInstance();

        cuptor.addPreparat(new Preparat("Paste",170,20));
        cuptor.addPreparat(new Preparat("Paste",220,10));
        cuptor.addPreparat(new Preparat("Paste",280,7));

        cuptor.afisarePreparate();
    }
}
