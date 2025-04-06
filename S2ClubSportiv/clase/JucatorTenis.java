package S2ClubSportiv.clase;

import S2ClubSportiv.prototype.JucatorPrototype;

import java.util.ArrayList;

public class JucatorTenis extends JucatorAbstract{
    public JucatorTenis(String nume, String pozitie) {
        super(nume, pozitie);

        // Antrenamente predefinite pentru tenis
        this.antrenamente.add("Antrenament de mobilitate");
        this.antrenamente.add("Antrenament de precizie a serviciului");
        this.antrenamente.add("Antrenament de rezistență pe teren");

        // Medicamente interzise pentru tenis
        this.medicamenteInterzise.add("Steroizi anabolizanți");
        this.medicamenteInterzise.add("Stimulente");
    }

    @Override
    public JucatorPrototype cloneaza() {
        JucatorTenis clone = new JucatorTenis(this.nume, this.pozitie);
        clone.antrenamente = new ArrayList<>(this.antrenamente);
        clone.medicamenteInterzise = new ArrayList<>(this.medicamenteInterzise);

        return clone;
    }

    @Override
    public void efectueazaAntrenament() {
        System.out.println("Jucătorul de tenis " + nume + " efectuează antrenamentul specific de tenis.");
    }
}
