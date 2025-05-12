package Subiect_Decorator_Composite.clase;

public class Produs implements IProdus{
    private String denumire;
    private int nrBucati;
    private double pret;

    public Produs(String denumire, int nrBucati, double pret) {
        this.denumire = denumire;
        this.nrBucati = nrBucati;
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getNrBucati() {
        return nrBucati;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void afiseazaDetalii(String indent) {
        System.out.println(indent + "Produs: " + denumire + " - Bucăți: " + nrBucati);
    }
}
