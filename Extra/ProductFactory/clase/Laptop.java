package Extra.ProductFactory.clase;

public class Laptop extends Product{
    public Laptop(String id, String name) {
        super(id, name);
    }

    public void displayInfo(){
        System.out.println("This is a laptop with ID: " + id + " and name: " + name);
    }

}
