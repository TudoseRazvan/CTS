package Recapitulare.Prototype.clase;

public class Adresa implements Cloneable {
    private String strada;
    private int nr;

    public Adresa(String strada, int nr) {
        this.strada = strada;
        this.nr = nr;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Adresa(this.strada, this.nr);
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "strada='" + strada + '\'' +
                ", nr=" + nr +
                '}';
    }
}
