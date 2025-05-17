package DesignPatterns.Composite.program;

import DesignPatterns.Composite.clase.Categorie;
import DesignPatterns.Composite.clase.Resursa;

public class Main {
    public static void main(String[] args) {
        //Nivel 1
        Categorie facultateaCSIE = new Categorie("Facultatea CSIE");

        //Nivel 2
        Categorie informaticaEconomica = new Categorie("Informatica Economica");
        facultateaCSIE.add(informaticaEconomica);

        //Nivel 3
        Categorie anul3 = new Categorie("Anul III");
        informaticaEconomica.add(anul3);

        //Nivel 4
        Categorie disciplinaCTS = new Categorie("CTS");
        anul3.add(disciplinaCTS);

        // Frunze -> Resurse
        disciplinaCTS.add(new Resursa("Curs DP",2));
        disciplinaCTS.add(new Resursa("Laborator Composite",1));
        disciplinaCTS.add(new Resursa("Workshop Clean Code",3));

        //Afisare arbore complet
        facultateaCSIE.print("");
    }
}
