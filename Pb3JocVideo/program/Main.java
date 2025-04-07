package Pb3JocVideo.program;

import Pb3JocVideo.clase.Personaj;
import Pb3JocVideo.clase.PersonajFactory;
import Pb3JocVideo.clase.Pozitie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personaj a1 = PersonajFactory.crearePersonaj(PersonajFactory.tipPersonaj.ANIMAL,
                new Pozitie(1,1), List.of("Ham", "Miau"));
        Personaj v1 = PersonajFactory.crearePersonaj(PersonajFactory.tipPersonaj.VRAJITOR,
                new Pozitie(2,1), List.of("Abracadabra"));
        Personaj s1 = PersonajFactory.crearePersonaj(PersonajFactory.tipPersonaj.SUPEREROU,
                new Pozitie(5,5),List.of("Sunt erou!"));

        System.out.println("Vrajitorul spune: " + v1.spuneCeva());
        v1.verificaProximitate(); //Ar putea invata "Ham" sau "Miau" de la animal

        System.out.println("Vrajitorul spune din nou: " + v1.spuneCeva());
    }
}
