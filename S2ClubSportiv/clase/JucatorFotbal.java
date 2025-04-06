package S2ClubSportiv.clase;

import S2ClubSportiv.prototype.JucatorPrototype;

import java.util.ArrayList;

public class JucatorFotbal extends JucatorAbstract {
    public JucatorFotbal(String nume, String pozitie) {
        super(nume, pozitie);

        //Antrenamente predefinite
        this.antrenamente.add("Antrenament de viteza");
        this.antrenamente.add("Antremante de precizie a suturilor");
        this.antrenamente.add("Antrenament de tactica de echipa");

        //Medicamente interzise pentru fotbalisti
        this.medicamenteInterzise.add("Steroizi anabolizanti");
        this.medicamenteInterzise.add("Eritropoietina (EPO)");
    }

    @Override
    public JucatorPrototype cloneaza() {
        JucatorFotbal clone = new JucatorFotbal(this.nume, this.pozitie);
        clone.antrenamente = new ArrayList<>(this.antrenamente);
        clone.medicamenteInterzise = new ArrayList<>(this.medicamenteInterzise);

        return clone;
    }

    @Override
    public void efectueazaAntrenament() {
        System.out.println("Jucatorul de fotbal " + nume + " (" + pozitie + ") efectueaza antrenamentul specific de fotbal");
    }
}
