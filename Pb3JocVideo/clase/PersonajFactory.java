package Pb3JocVideo.clase;

import java.util.List;

public class PersonajFactory {
    public enum tipPersonaj {ANIMAL, VRAJITOR, SUPEREROU}

    public static Personaj crearePersonaj(tipPersonaj tip, Pozitie pozitie, List<String> mesaje){
        Personaj p = switch (tip){
            case ANIMAL -> new Animal(mesaje, pozitie);
            case SUPEREROU -> new SuperErou(mesaje, pozitie);
            case VRAJITOR -> new Vrajitor(pozitie,mesaje);
        };
        Canvas.getInstance().adaugaPersonaj(p);
        return p;
    }
}
