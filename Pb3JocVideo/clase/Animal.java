package Pb3JocVideo.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Animal implements Personaj{
    protected List<String> mesaje;
    protected Pozitie pozitie;

    public Animal(List<String> mesajeInitiale, Pozitie pozitie) {
        this.mesaje = new ArrayList<>(mesajeInitiale);
        this.pozitie = pozitie;
    }

    @Override
    public String spuneCeva() {
        return mesaje.get(new Random().nextInt(mesaje.size()));
    }

    @Override
    public void verificaProximitate() {
        //Nu face nimic, animalele nu invata mesaje
    }

    @Override
    public Pozitie getPozitie() {
        return pozitie;
    }
}
