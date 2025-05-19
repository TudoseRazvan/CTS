package Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.decorator.program;

import Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.decorator.clase.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // --- Decorator ---
        IModCalculator magazin = new Magazin();
        IModCalculator magazinDecorat = new MagazinCuDiscountPrimaComanda(magazin);

        List<Produs> produseC1 = List.of(
                new Produs("Paine", 10),
                new Produs("Lapte", 8.5),
                new Produs("Apa", 4.5),
                new Produs("Branza", 35)
        );

        List<Produs> produseC2 = List.of(
                new Produs("Coca Cola", 4.5),
                new Produs("Lapte", 8.5),
                new Produs("Iaurt", 3.5),
                new Produs("Piept de pui", 30)
        );


        Client c1 = new Client("1", "Ana Popescu");
        Client c2 = new Client("2","Mihai Ionescu");
        Adresa a1 = new Adresa("Strada A", 10);
        Adresa a2 = new Adresa("Strada B", 20);

        Cos cos1 = new Cos(c1, produseC1);
        Cos cos2 =new Cos(c2, produseC2);

        magazinDecorat.calculeazaTotal(cos1, a1);
        System.out.println();
        magazinDecorat.calculeazaTotal(cos2,a2);
        System.out.println();
        magazinDecorat.calculeazaTotal(cos2,a2);

    }
}
