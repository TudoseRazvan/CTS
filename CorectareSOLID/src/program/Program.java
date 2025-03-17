package program;

import clase.Aplicant;
import finantare.IFinantare;
import readers.AngajatReader;
import readers.ElevReader;
import readers.IReadable;
import readers.StudentReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Aplicant> listaAngajati;
        List<Aplicant> listaStudenti;
        List<Aplicant> listaElevi;

        try {
            IReadable<Aplicant> angajatReader = new AngajatReader();
            listaAngajati = angajatReader.readData("angajati.txt");

            IReadable<Aplicant> studentReader = new StudentReader();
            listaStudenti = studentReader.readData("studenti.txt");

            IReadable<Aplicant> elevReader = new ElevReader();
            listaElevi = elevReader.readData("elevi.txt");

            System.out.println("===== ANGAJATI =====");
            afiseazaAplicanti(listaAngajati);

            System.out.println("\n===== STUDENTI =====");
            afiseazaAplicanti(listaStudenti);

            System.out.println("\n===== ELEVI =====");
            afiseazaAplicanti(listaElevi);

        } catch (FileNotFoundException e) {
            System.out.println("Eroare la citirea din fisier: " + e.getMessage());
        }
    }

    public static void afiseazaAplicanti(List<Aplicant> listaAplicanti) {
        for (Aplicant aplicant : listaAplicanti) {
            System.out.println(aplicant.toString());

            boolean esteAcceptat = "acceptat".equals(aplicant.getStatusInProiect());
            aplicant.afisareStatus();

            // Afiseaza informatia despre finantare doar daca aplicantul a fost acceptat
            if (esteAcceptat && aplicant instanceof IFinantare) {
                System.out.println(((IFinantare) aplicant).getRaportFinantare());
            }

            System.out.println();
        }
    }
}