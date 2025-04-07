package Extra.ProductBuilder.program;

import Extra.ProductBuilder.clase.Produs;
import Extra.ProductBuilder.clase.ProdusBuilder;

public class Main {
    public static void main(String[] args) {
        Produs produs1 = new ProdusBuilder("Laptop Dell", 5999.99, "Arginitiu").build();
        Produs produs2 = new ProdusBuilder("Laptop OMEN", 7999.99, "Negru").build();

        produs1.detalii();
        produs2.detalii();

    }



}
