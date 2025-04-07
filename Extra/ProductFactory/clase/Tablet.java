package Extra.ProductFactory.clase;

public class Tablet extends Product{
    public Tablet(String id, String name) {
        super(id, name);
    }

    public void displayInfo(){
        System.out.println("This is a tablet with ID: " + id + " and name: " + name);
    }
}
