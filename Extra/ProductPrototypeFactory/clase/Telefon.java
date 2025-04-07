package Extra.ProductPrototypeFactory.clase;

public class Telefon implements IProdus {
    private String marca;
    private double pret;

    public Telefon(String marca, double pret) {
        this.marca = marca;
        this.pret = pret;
    }

    public Telefon(Telefon original) {
        this.marca = original.marca;
        this.pret = original.pret;
    }

    @Override
    public IProdus clone() {
        return new Telefon(this);
    }

    @Override
    public void afiseaza() {
        System.out.println("Telefon: " + marca + " - Pret: " + pret + " RON");
    }
}

