package S1MagazineMall.builder;

import S1MagazineMall.clase.Magazin;
import S1MagazineMall.clase.MaterialTip;
import S1MagazineMall.exceptions.InvalidInputException;
import S1MagazineMall.clase.Decoratiune;
import S1MagazineMall.clase.PodeaPersonalizata;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder {
    //Parametrii obligatorii
    private final String denumire;
    private final double suprafata;
    //Parametrii optionali - valori default
    private int numarIntrari = 1;
    private PodeaPersonalizata podeaPersonalizata = null;
    private List<Decoratiune> decoratiuni = new ArrayList<>();

    public Magazin build(){
        return new Magazin(this);
    }

    public MagazinBuilder(String denumire, double suprafata) throws InvalidInputException {
        if(denumire == null || denumire.isEmpty()){
            throw new InvalidInputException("Denumirea magazinului nu poate fi goala!");
        }
        if(suprafata <=0){
            throw new InvalidInputException("Suprafata magazinului nu poate fi mai mica de 0");
        }

        this.denumire = denumire;
        this.suprafata = suprafata;
    }

    public MagazinBuilder cuNumarIntrari(int numarIntrari) throws InvalidInputException{
        //Verificare restrictie -> minim 1 intrare pe 100 mp
        if(numarIntrari < Math.ceil(suprafata / 100)){
            throw new InvalidInputException("Numarul de intrari trebuie sa fie minim " +
                    Math.ceil(suprafata/100) + " pentru o suprafata de " + suprafata + " mp");
        }
        this.numarIntrari = numarIntrari;
        return this;
    }

    public MagazinBuilder cuPodeaPersonalizata(String tip, double duritate) throws InvalidInputException {
        if(tip == null || tip.isEmpty()){
            throw new InvalidInputException("Tipul podelei nu poate fi gol!");
        }
        if(duritate <= 0){
            throw new InvalidInputException("Duritatea podelei trebuie sa fie pozitiva!");
        }
        this.podeaPersonalizata = new PodeaPersonalizata(tip, duritate);
        return this;
    }

    public MagazinBuilder adaugaDecoratiune(String nume, MaterialTip material) throws InvalidInputException {
       //Verificare restrictie, fara decoratiuni din sticla pentru podele moi < 2
        if(podeaPersonalizata != null && podeaPersonalizata.getDuritate() < 2 && material == MaterialTip.STICLA){
            throw new InvalidInputException("Nu se permit decoratiuni din sticla pentru podele moi cu duritate mai mica de 2!");
        }

        decoratiuni.add(new Decoratiune(nume, material));
        return this;
    }

    //Getteri pentru a permite accesul din constructorul clasei Magazin
    public String getDenumire() {
        return denumire;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public int getNumarIntrari() {
        return numarIntrari;
    }

    public PodeaPersonalizata getPodeaPersonalizata() {
        return podeaPersonalizata;
    }

    public List<Decoratiune> getDecoratiuni() {
        return decoratiuni;
    }
}
