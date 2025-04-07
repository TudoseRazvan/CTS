package Extra.ProductFactory.program;

import Extra.ProductFactory.clase.Product;
import Extra.ProductFactory.clase.ProductFactory;

public class Main {
    public static void main(String[] args) {
        Product laptop = ProductFactory.createProduct("laptop", "1", "Dell XPS 13");
        Product smartphone = ProductFactory.createProduct("smartphone","2","Samsung Galaxy S24+");
        Product tablet = ProductFactory.createProduct("tablet","3","iPad Pro");

        laptop.displayInfo();
        smartphone.displayInfo();
        tablet.displayInfo();

        System.out.println("\nLista de produse:");
        System.out.println(laptop);
        System.out.println(smartphone);
        System.out.println(tablet);
    }
}
