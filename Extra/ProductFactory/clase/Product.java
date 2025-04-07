package Extra.ProductFactory.clase;

public abstract class Product implements IProduct {
    protected String id;
    protected String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void displayInfo() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
