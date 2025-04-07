package Extra.ProductPrototypeFactory.clase;

public class Laptop implements IProdus{
    private String model;
    private double pret;

    public Laptop(String model, double pret) {
        this.model = model;
        this.pret = pret;
    }

    public Laptop(Laptop original){
        this.model = original.model;
        this.pret = original.pret;
    }

    @Override
    public IProdus clone() {
        return new Laptop(this);
    }

    @Override
    public void afiseaza() {
        System.out.println("Laptop: " + model + " - Pret: " + pret +" RON");
    }
}
