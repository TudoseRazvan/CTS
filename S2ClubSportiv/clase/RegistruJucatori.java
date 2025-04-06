package S2ClubSportiv.clase;

import java.util.ArrayList;
import java.util.List;

public class RegistruJucatori {
    private List<JucatorAbstract> jucatoriInregistrati;

    public RegistruJucatori() {
        this.jucatoriInregistrati = new ArrayList<>();
    }

    public void adaugaJucator(JucatorAbstract jucator){
        this.jucatoriInregistrati.add(jucator);
        System.out.println("Jucatorul " + jucator.getNume() + " a fost inregistrat in sistem.");
    }

    public void notificaMedicamenteInterzisNou(String medicamentNou){
        System.out.println("\n=== NOTIFICARE IMPORTANTA: Medicament nou interzis ===");
        System.out.println("S-a adaugat un medicament nou in lista substantelor interzise: " + medicamentNou);

        for(JucatorAbstract jucator : jucatoriInregistrati){
            jucator.adaugaMedicamentInterzis(medicamentNou);
        }
    }

    public List<JucatorAbstract> getJucatoriInregistrati() {
        return jucatoriInregistrati;
    }
}
