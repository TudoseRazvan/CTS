package Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.composite.program;

import Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.composite.clase.Categorie;
import Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.composite.clase.Produs;

public class Main {
    public static void main(String[] args) {
        // --- Composite ---
        Categorie electronice = new Categorie("Electronice");
        Categorie telefoane = new Categorie("Telefoane");
        Categorie smartphone = new Categorie("Smartphone");

        Produs iphone = new Produs("iPhone 16 Pro Max", 5);
        Produs samsung = new Produs("Samsung s25+",3);

        smartphone.adauga(iphone);
        smartphone.adauga(samsung);
        telefoane.adauga(smartphone);


        Categorie computere = new Categorie("Computere");
        Produs laptop = new Produs("Laptop Dell",2);
        computere.adauga(laptop);

        electronice.adauga(telefoane);
        electronice.adauga(computere);

        electronice.afiseaza();
    }
}
