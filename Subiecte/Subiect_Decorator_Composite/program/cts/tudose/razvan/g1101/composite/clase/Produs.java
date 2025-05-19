package Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.composite.clase;

//Leaf
public class Produs implements IProdus{
    private String denumire;
    private int stoc;

    public Produs(String denumire, int stoc) {
        this.denumire = denumire;
        this.stoc = stoc;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getStoc() {
        return stoc;
    }

    @Override
    public void afiseaza() {
        System.out.println("Produs: " + denumire + " (Stoc: " + stoc + ")");
    }


    @Override
    public void adauga(IProdus produs) {

    }

    @Override
    public void sterge(IProdus produs) {

    }

    @Override
    public int numaraProduse() {
        return 0;
    }
}
