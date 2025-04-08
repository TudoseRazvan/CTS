package Recapitulare.PrototypeFactory.clase;

public class Telefon implements IProdus{
    private String model;
    private double pret;

    public Telefon(String model, double pret) {
        this.model = model;
        this.pret = pret;
    }


    @Override
    public IProdus clone() {
        return new Telefon(this.model, this.pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Telefon: " + model + " - Pret: " + pret + " RON");
    }
}
