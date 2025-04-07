package Extra.ProductSingletonRegistry.clase;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
    //Private Map care stocheaza produsele -> obligatoriu
    private static Map<String, Product> productRegistry = new HashMap<>();

    //Constructor privat pentru a preveni instantierea din exterior
    private ProductRegistry(){}

    //Metoda statica pentru a obtine un produs existent sau pentru a crea unul nou
    public static Product getProduct(String id, String name){
        if(!productRegistry.containsKey(id)){
            Product product = new Product(id,name);
            productRegistry.put(id, product);
            System.out.println("Product created: " + product);
        }
        return productRegistry.get(id);
    }

    //Metoda pentru a obtine toate produsele din registry
    public static Map<String, Product>getAllProducts(){
        return productRegistry;
    }

}
