package Extra.ProductSingletonRegistry.program;

import Extra.ProductSingletonRegistry.clase.Product;
import Extra.ProductSingletonRegistry.clase.ProductRegistry;

public class Main {
    public static void main(String[] args) {
        Product product1 = ProductRegistry.getProduct("1","Laptop");
        Product product2 = ProductRegistry.getProduct("2","Smartphone");
        Product product3 = ProductRegistry.getProduct("1","Laptop"); // Se va reutiliza produsul existent

        //Afisarea tuturor produselor din registry
        System.out.println("\nLista de produse:");
        for(Product product : ProductRegistry.getAllProducts().values()){
            System.out.println(product);
        }
    }
}
