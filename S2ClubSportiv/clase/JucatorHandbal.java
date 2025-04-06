package S2ClubSportiv.clase;

import S2ClubSportiv.prototype.JucatorPrototype;

import java.util.ArrayList;

public class JucatorHandbal extends JucatorAbstract{
    public JucatorHandbal(String nume, String pozitie) {
        super(nume, pozitie);

        // Antrenamente predefinite pentru handbalisti
        this.antrenamente.add("Antrenament de forță");
        this.antrenamente.add("Antrenament de aruncări la poartă");
        this.antrenamente.add("Antrenament de coordonare");

        // Medicamente interzise pentru handbalisti
        this.medicamenteInterzise.add("Steroizi anabolizanți");
        this.medicamenteInterzise.add("Diuretice");
    }

    @Override
    public JucatorPrototype cloneaza() {
        JucatorHandbal clone = new JucatorHandbal(this.nume, this.pozitie);
        clone.antrenamente = new ArrayList<>(this.antrenamente);
        clone.medicamenteInterzise = new ArrayList<>(this.medicamenteInterzise);

        return clone;
    }

    @Override
    public void efectueazaAntrenament() {
        System.out.println("Jucatorul de handbal" + nume + " (" + pozitie + ") efectueaza antrenamentul specific de handbal");
    }
}
