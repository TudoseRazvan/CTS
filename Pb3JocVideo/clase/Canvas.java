package Pb3JocVideo.clase;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private static Canvas instance = null;
    private List<Personaj> personaje = new ArrayList<>();

    private Canvas(){}

    public static synchronized Canvas getInstance(){
        if(instance==null){
            instance = new Canvas();
        }
        return instance;
    }

    public void adaugaPersonaj(Personaj p){
        personaje.add(p);
    }

    public List<Personaj> getPersonaje(){
        return personaje;
    }

}
