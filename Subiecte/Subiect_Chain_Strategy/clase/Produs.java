package Subiecte.Subiect_Chain_Strategy.clase;

public class Produs {
    private String nume;
    private double pret;
    private String marime;
    private String culoare;
    private String brand;

    public Produs(String nume, double pret, String marime, String culoare, String brand) {
        this.nume = nume;
        this.pret = pret;
        this.marime = marime;
        this.culoare = culoare;
        this.brand = brand;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public String getMarime() {
        return marime;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", marime='" + marime + '\'' +
                ", culoare='" + culoare + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
