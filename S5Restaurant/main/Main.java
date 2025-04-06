package S5Restaurant.main;

import S5Restaurant.clase.Comanda;
import S5Restaurant.clase.Cuptor;
import S5Restaurant.clase.Preparat;
import S5Restaurant.singlethon.GestiuneCuptoare;

public class Main {
    public static void main(String[] args) {
        // Prima parte - un singur cuptor (Singleton)
        System.out.println("=== TESTARE CU UN SINGUR CUPTOR ===");
        GestiuneCuptoare gestiune = GestiuneCuptoare.getInstance();
        Cuptor cuptorUnic = new Cuptor("Cuptor Principal", 300);
        gestiune.adaugaCuptor(cuptorUnic);

        // Crearea preparatelor
        Preparat pizza = new Preparat("Pizza Margherita", 15, 250);
        Preparat prajitura = new Preparat("Prăjitură cu ciocolată", 30, 180);
        Preparat paine = new Preparat("Pâine de casă", 45, 200);
        Preparat lasagna = new Preparat("Lasagna", 35, 220);
        Preparat placinta = new Preparat("Plăcintă cu mere", 25, 190);

        // Creare comenzi
        Comanda comanda1 = new Comanda(1, "Popescu Ion");
        comanda1.adaugaPreparat(pizza);

        Comanda comanda2 = new Comanda(2, "Ionescu Maria");
        comanda2.adaugaPreparat(prajitura);
        comanda2.adaugaPreparat(paine);

        Comanda comanda3 = new Comanda(3, "Georgescu Andrei");
        comanda3.adaugaPreparat(lasagna);

        Comanda comanda4 = new Comanda(4, "Vasilescu Elena");
        comanda4.adaugaPreparat(placinta);
        comanda4.adaugaPreparat(pizza);

        // Afișare detalii comenzi
        comanda1.afiseazaDetaliiComanda();
        comanda2.afiseazaDetaliiComanda();
        comanda3.afiseazaDetaliiComanda();
        comanda4.afiseazaDetaliiComanda();

        // Adăugare preparate în cuptorul unic
        System.out.println("\n=== ADĂUGARE PREPARATE ÎN CUPTORUL UNIC ===");
        for (Preparat preparat : comanda1.getPreparate()) {
            cuptorUnic.adaugaPreparat(preparat);
        }

        for (Preparat preparat : comanda2.getPreparate()) {
            cuptorUnic.adaugaPreparat(preparat);
        }

        for (Preparat preparat : comanda3.getPreparate()) {
            cuptorUnic.adaugaPreparat(preparat);
        }

        for (Preparat preparat : comanda4.getPreparate()) {
            cuptorUnic.adaugaPreparat(preparat);
        }

        // Afișare lista de așteptare
        cuptorUnic.afiseazaListaAsteptare();

        // A doua parte - mai multe cuptoare și alocarea optimă
        System.out.println("\n\n=== TESTARE CU MAI MULTE CUPTOARE ===");

        // Reset gestiune cuptoare pentru a doua parte
        gestiune = GestiuneCuptoare.getInstance();

        // Crearea celor 4 cuptoare
        Cuptor cuptor1 = new Cuptor("Cuptor Pizza", 300);
        Cuptor cuptor2 = new Cuptor("Cuptor Prăjituri", 220);
        Cuptor cuptor3 = new Cuptor("Cuptor Pâine", 250);
        Cuptor cuptor4 = new Cuptor("Cuptor Universal", 280);

        // Adăugare cuptoare în gestiune
        gestiune.adaugaCuptor(cuptor1);
        gestiune.adaugaCuptor(cuptor2);
        gestiune.adaugaCuptor(cuptor3);
        gestiune.adaugaCuptor(cuptor4);

        // Crearea unei noi comenzi
        Comanda comanda5 = new Comanda(5, "Dumitrescu Bogdan");
        comanda5.adaugaPreparat(pizza);
        comanda5.adaugaPreparat(prajitura);
        comanda5.adaugaPreparat(lasagna);

        comanda5.afiseazaDetaliiComanda();

        // Asignare optimă a preparatelor către cuptoare
        System.out.println("\n=== ASIGNARE OPTIMĂ A PREPARATELOR CĂTRE CUPTOARE ===");

        // Asignare pentru comanda 1
        for (Preparat preparat : comanda1.getPreparate()) {
            gestiune.asigneazaPreparatOptim(preparat);
        }

        // Asignare pentru comanda 2
        for (Preparat preparat : comanda2.getPreparate()) {
            gestiune.asigneazaPreparatOptim(preparat);
        }

        // Asignare pentru comanda 3
        for (Preparat preparat : comanda3.getPreparate()) {
            gestiune.asigneazaPreparatOptim(preparat);
        }

        // Asignare pentru comanda 4
        for (Preparat preparat : comanda4.getPreparate()) {
            gestiune.asigneazaPreparatOptim(preparat);
        }

        // Asignare pentru comanda 5
        for (Preparat preparat : comanda5.getPreparate()) {
            gestiune.asigneazaPreparatOptim(preparat);
        }

        // Afișare lista de așteptare pentru toate cuptoarele
        gestiune.afiseazaToateCuptoarele();
    }
}
