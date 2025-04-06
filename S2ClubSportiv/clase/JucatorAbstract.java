package S2ClubSportiv.clase;

import S2ClubSportiv.prototype.JucatorPrototype;

import java.util.ArrayList;
import java.util.List;

public abstract class JucatorAbstract implements JucatorPrototype {
    protected String nume;
    protected String pozitie;
    protected List<String> antrenamente;
    protected List<String> medicamenteInterzise;


    public JucatorAbstract(String nume, String pozitie) {
        this.nume = nume;
        this.pozitie = pozitie;
        this.antrenamente = new ArrayList<>();
        this.medicamenteInterzise = new ArrayList<>();
    }

    @Override
    public void adaugaAntrenament(String antrenament) {
        this.antrenamente.add(antrenament);
        System.out.println("Jucatorul " + nume + " a adaugat antrenamentul " + antrenament);
    }

    @Override
    public void adaugaMedicamentInterzis(String medicament) {
        if(!this.medicamenteInterzise.contains(medicament)){
            this.medicamenteInterzise.add(medicament);
            System.out.println("Medicamentul interzis " + medicament + " a fost adaugat in lista jucatorului " + nume);
        }
    }

    @Override
    public void afisareDetalii() {
        System.out.println("\n--- Detalii Jucător ---");
        System.out.println("Nume: " + nume);
        System.out.println("Poziție: " + pozitie);

        System.out.println("Antrenamente:");
        for(String antrenament : antrenamente) {
            System.out.println("- " + antrenament);
        }

        System.out.println("Medicamente interzise:");
        for(String medicament : medicamenteInterzise) {
            System.out.println("- " + medicament);
        }
    }

    public void efectueazaAntrenament(){
        System.out.println("Jucatorul " + nume + " (" + pozitie + ") efectueaza antrenamentul");
    }

    public void efectueazaTestAntidoping(){
        System.out.println("Jucatorul " + nume + " efectueaza test antidoping pentru urmatoarele substante");
        for(String medicament : medicamenteInterzise){
            System.out.println("- " + medicament);
        }
        System.out.println("Test antidoping finalizat pentru " + nume);
    }

    public String getNume() {
        return nume;
    }
}
