package Extra.ProductPrototype.clase;

public class Laptop extends Produs{
    private String sistemOperare;

    public Laptop(String nume, double pret, String sistemOperare) {
        super(nume, pret);
        this.sistemOperare = sistemOperare;
    }

    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }

    public String getSistemOperare() {
        return sistemOperare;
    }

    @Override
    public Laptop clone() {
        return new Laptop(this.nume, this.pret, this.sistemOperare);
    }

    @Override
    public void detalii() {
        super.detalii();
        System.out.println("Sistem operare: " + sistemOperare);
    }
}
