package Extra.ProductBuilder.clase;

public class ProdusBuilder implements IBuilder{
    protected String nume;
    protected double pret;
    protected String culoare;

    public ProdusBuilder(String nume, double pret, String culoare) {
        this.nume = nume;
        this.pret = pret;
        this.culoare = culoare;
    }

    @Override
    public Produs build() {
        return new Produs(this);
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public String getCuloare() {
        return culoare;
    }
}
