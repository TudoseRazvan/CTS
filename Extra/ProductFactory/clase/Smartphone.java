package Extra.ProductFactory.clase;

public class Smartphone extends Product{
    public Smartphone(String id, String name) {
        super(id, name);
    }

    public void displayInfo(){
        System.out.println("This is a smartphone with ID: " + id + " and name: " + name);
    }
}
