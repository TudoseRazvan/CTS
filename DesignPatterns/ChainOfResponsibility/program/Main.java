package DesignPatterns.ChainOfResponsibility.program;

import DesignPatterns.ChainOfResponsibility.clase.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carte> stoc = List.of(
                new Carte("Dune", "SF","RO",55),
                new Carte("Neuromancer", "SF", "EN", 42),
                new Carte("Hobbitul", "Fantasy", "RO", 48),
                new Carte("Mistborn", "Fantasy", "EN", 60),
                new Carte("Solaris", "SF", "RO", 38),
                new Carte("The Witcher", "Fantasy", "EN", 75),
                new Carte("Foundation", "SF", "EN", 65)
        );

        //Lant: GEN -> PRET
        IFiltru f1 = new FiltruGen("SF");
        IFiltru f2 = new FiltruPretMax(60f);
        f1.setNext(f2);

        System.out.println("=== Cautare 1 (SF & <= 60 RON) ===");
        f1.aplica(stoc).forEach(System.out::println);

        //Lant: GEN -> LIMBA
        IFiltru g1 = new FiltruGen("Fantasy");
        IFiltru g2 = new FiltruLimba("EN");
        g1.setNext(g2);

        System.out.println("\n=== Căutare 2 (Fantasy & EN) ===");
        g1.aplica(stoc).forEach(System.out::println);

    }
}
