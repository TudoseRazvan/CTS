package Pb3JocVideo.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vrajitor implements Personaj{
    private static List<String> memorieColectiva = new ArrayList<>();
    private Pozitie pozitie;

    public Vrajitor(Pozitie pozitie, List<String> mesajeInitiale) {
        this.pozitie = pozitie;
        for(String msg: mesajeInitiale){
            if(!memorieColectiva.contains(msg))
                memorieColectiva.add(msg);
        }
    }

    @Override
    public String spuneCeva() {
        return memorieColectiva.get(new Random().nextInt(memorieColectiva.size()));
    }

    @Override
    public void verificaProximitate() {
        for(Personaj p : Canvas.getInstance().getPersonaje()){
            if(p != this && p.getPozitie().esteInApropriere(this.pozitie)){
                String mesajNou = p.spuneCeva();
                if(!memorieColectiva.contains(mesajNou)){
                    memorieColectiva.add(mesajNou);
                    System.out.println("Vrajitorul a invatat un mesaj nou: " + mesajNou);
                }
            }
        }
    }

    @Override
    public Pozitie getPozitie() {
        return pozitie;
    }
}
