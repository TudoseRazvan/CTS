package Extra.ProductBuilder.clase;

public class Produs {
    private final String nume;
    private final double pret;
    private final String culoare;

    public Produs(ProdusBuilder builder) {
        this.nume = builder.getNume();
        this.pret = builder.getPret();
        this.culoare = builder.getCuloare();
    }

    public void detalii(){
        System.out.println("Produs: " + nume + ", Pret: " + pret + ", Culoare: " + culoare);
    }
}
