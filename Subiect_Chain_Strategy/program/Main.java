package Subiect_Chain_Strategy.program;

import Subiect_Chain_Strategy.clase.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MagazinPantofi magazin = new MagazinPantofi();

        magazin.adaugaProdus(new Produs("Adidas Ultraboost", 150, "42", "Negru", "Adidas"));
        magazin.adaugaProdus(new Produs("Nike Air Max", 180, "43", "Alb", "Nike"));
        magazin.adaugaProdus(new Produs("Puma Runner", 100, "41", "Rosu", "Puma"));
        magazin.adaugaProdus(new Produs("Converse Chuck", 80, "42", "Alb", "Converse"));
        magazin.adaugaProdus(new Produs("Asics Gel", 200, "43", "Negru", "Asics"));
        magazin.adaugaProdus(new Produs("New Balance", 130, "42", "Gri", "New Balance"));
        magazin.adaugaProdus(new Produs("Reebok Classic", 90, "41", "Alb", "Reebok"));

        System.out.println("Cautare 1 - Pantofi pana in 200 lei, marimea 42:");
        CautarePretMic cautarePret = new CautarePretMic(200);
        CautareMarime cautareMarime = new CautareMarime("42");

        cautarePret.setUrmatorulCriteriu(cautareMarime);

        List<Produs> rezultatCautare1 = magazin.cautaProduse(cautarePret);
        for(Produs produs : rezultatCautare1){
            System.out.println(produs);
        }

        //Testare cu Strategy
        System.out.println("\nTestare client cu parametrizare implicita:");
        IClient clienImplicit = new ClientParametrizareImplicita();
        List<Produs> rezultatClientImplicit = magazin.cautaProduse(clienImplicit.obtineCautare());
        for(Produs produs : rezultatClientImplicit){
            System.out.println(produs);
        }

        System.out.println("\nTestare client cu parametrizare personalizata: ");
        IClient clientPersonalizat = new ClientParametrizarePersonalizata();
        List<Produs> rezultatClientPersonalizat = magazin.cautaProduse(clientPersonalizat.obtineCautare());
        for (Produs produs : rezultatClientPersonalizat){
            System.out.println(produs);
        }
    }
}