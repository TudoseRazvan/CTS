package Subiect_Decorator_Composite.program;

import Subiect_Decorator_Composite.clase.CategorieProdus;
import Subiect_Decorator_Composite.clase.DiscountDecoratorMagazin;
import Subiect_Decorator_Composite.clase.Magazin;
import Subiect_Decorator_Composite.clase.Produs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Magazin magazin = new Magazin();
        DiscountDecoratorMagazin magazinCuDiscount = new DiscountDecoratorMagazin(magazin);

        List<Produs> comenziClient1 = new ArrayList<>();
        Produs telefon = new Produs("Telefon",1,1000);
        Produs incarcator = new Produs("Incarcator",2,50);

        comenziClient1.add(telefon);
        comenziClient1.add(incarcator);

        List<Produs> comenziClient2 = new ArrayList<>();
        Produs laptop = new Produs("Laptop",1,2500);
        Produs geanta = new Produs("Geanta",2,500);
        comenziClient2.add(laptop);
        comenziClient2.add(geanta);

        System.out.println("Comanda Client 1 (cu discount):");
        double total1 = magazinCuDiscount.calculeazaTotalPlata(comenziClient1, "Bucuresti", "Client1");
        System.out.println("Total plata: " + total1);

        System.out.println("Comanda Client 1 (fara discount):");
        total1 = magazinCuDiscount.calculeazaTotalPlata(comenziClient1, "Bucuresti", "Client1");
        System.out.println("Total plata: " + total1);

        System.out.println("Comanda Client 2 (cu discount):");
        double total2 = magazinCuDiscount.calculeazaTotalPlata(comenziClient2, "Cluj", "Client2");
        System.out.println("Total plata: " + total2);

        //Testare structura arborescenta de produse
        System.out.println("\nStructura Magazin Online:");
        CategorieProdus electronice = new CategorieProdus("Electronice");

        CategorieProdus telefoane = new CategorieProdus("Telefoane");
        telefoane.adaugaProdus(new Produs("iPhone 16 PRO",5,5000));
        telefoane.adaugaProdus(new Produs("Samsung S24+",3, 3800));

        CategorieProdus laptopuri = new CategorieProdus("Laptopuri");
        laptopuri.adaugaProdus(new Produs("MacBook",2,2500));
        laptopuri.adaugaProdus(new Produs("Dell",4,1800));

        electronice.adaugaProdus(telefoane);
        electronice.adaugaProdus(laptopuri);

        CategorieProdus imbracaminte = new CategorieProdus("Imbracaminte");
        imbracaminte.adaugaProdus(new Produs("Tricou",10,150));
        imbracaminte.adaugaProdus(new Produs("Geaca",7,200));

        //Afisare structura completa
        electronice.afiseazaDetalii("");
        imbracaminte.afiseazaDetalii("");
    }
}
