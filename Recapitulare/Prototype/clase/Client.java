package Recapitulare.Prototype.clase;

public class Client implements  Cloneable{
    private String nume;
    private Adresa adresa;

    public Client(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Adresa adresaClonata = (Adresa) this.adresa.clone();
        return new Client(this.nume, adresaClonata);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", adresa=" + adresa +
                '}';
    }
}
