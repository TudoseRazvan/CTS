package DesignPatterns.ChainOfResponsibility.clase;

public class Carte {
    private final String titlu;
    private final String gen;
    private final String limba;
    private final float pret;

    public Carte(String titlu, String gen, String limba, float pret) {
        this.titlu = titlu;
        this.gen = gen;
        this.limba = limba;
        this.pret = pret;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getGen() {
        return gen;
    }

    public String getLimba() {
        return limba;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return titlu + " | " + gen + " | " + limba + " | " + pret + " RON";
    }
}
