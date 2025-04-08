package Recapitulare.PrototypeFactory.clase;

public class Laptop implements IProdus {
    private String model;
    private double pret;

    public Laptop(String model, double pret) {
        this.model = model;
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public IProdus clone() {
        return new Laptop(this.model, this.pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Laptop: " + model + " - Pret: " + pret +" RON");
    }
}
