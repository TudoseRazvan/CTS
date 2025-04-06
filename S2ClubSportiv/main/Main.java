package S2ClubSportiv.main;

import S2ClubSportiv.clase.JucatorAbstract;
import S2ClubSportiv.clase.JucatorFotbal;
import S2ClubSportiv.clase.JucatorHandbal;
import S2ClubSportiv.clase.RegistruJucatori;
import S2ClubSportiv.prototype.JucatorPrototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== APLICAȚIE DE GESTIUNE A CLUBULUI SPORTIV ===");

        RegistruJucatori registruJucatori = new RegistruJucatori();

        JucatorFotbal jucatorFotbal1 = new JucatorFotbal("Andrei Popescu", "Atacant");
        JucatorFotbal jucatorFotbal2 = new JucatorFotbal("Mihai Ionescu", "Portar");
        JucatorHandbal jucatorHandbal = new JucatorHandbal("Elena Popa", "Inter");

        System.out.println("\n=== ÎNREGISTRARE JUCĂTORI ===");
        registruJucatori.adaugaJucator(jucatorFotbal1);
        registruJucatori.adaugaJucator(jucatorFotbal2);
        registruJucatori.adaugaJucator(jucatorHandbal);

        System.out.println("\n=== DETALII INIȚIALE JUCĂTORI ===");
        for(JucatorAbstract jucator: registruJucatori.getJucatoriInregistrati()){
            jucator.afisareDetalii();
        }

        System.out.println("\n=== SIMULARE PROCES DE ANTRENAMENT ===");
        for(JucatorAbstract jucator : registruJucatori.getJucatoriInregistrati()){
            jucator.efectueazaAntrenament();
        }

        // Actualizeaza lista de antrenamente pentru un jucator
        System.out.println("\n=== ACTUALIZARE ANTRENAMENTE PERSONALE ===");
        jucatorFotbal1.adaugaAntrenament("Antrenament personal de rezistenta");
        jucatorFotbal1.adaugaAntrenament("Antrenament personal de finalizare");

        // Adaugare medicament interzis nou si notifica toti jucatorii
        System.out.println("\n=== ADĂUGARE MEDICAMENT INTERZIS NOU ===");
        registruJucatori.notificaMedicamenteInterzisNou("Hormoni de crestere");

        // Simulare proces test anti-doping
        System.out.println("\n=== SIMULARE TESTARE ANTI-DOPING ===");
        for(JucatorAbstract jucator : registruJucatori.getJucatoriInregistrati()){
            jucator.efectueazaTestAntidoping();
        }

        // Demonstram functionalitatea pattern-ului Prototype prin clonare unui jucator
        System.out.println("\n=== DEMONSTRARE PATTERN PROTOTYPE - CLONARE JUCĂTOR ===");
        JucatorPrototype jucatorClonat = jucatorFotbal1.cloneaza();
        System.out.println("Jucator clonat creat cu succes!");
        jucatorClonat.afisareDetalii();

        System.out.println("\n=== FINAL APLICATIE ===");
    }
}
