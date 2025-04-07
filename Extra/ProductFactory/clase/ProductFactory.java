package Extra.ProductFactory.clase;

public class ProductFactory {

    //Factory method pentru crearea produselor pe baza unui tip
    public static Product createProduct(String type, String id, String name){
        switch (type.toLowerCase()){
            case "laptop":
                return new Laptop(id,name);
            case "smartphone":
                return new Smartphone(id,name);
            case "tablet":
                return new Tablet(id,name);
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}
