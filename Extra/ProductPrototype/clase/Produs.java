package Extra.ProductPrototype.clase;

public abstract class Produs implements Cloneable{
    protected String nume;
    protected double pret;

    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public abstract Produs clone();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void detalii(){
        System.out.println("Produs: " + nume + ", Pret: " + pret);
    }
}
