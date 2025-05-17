package DesignPatterns.Composite.clase;

// Leaf
public class Resursa implements CatalogComponent{
    private final String name;
    private final int hours;

    public Resursa(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public int getStudyHours() {
        return hours;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- " + name + " (" + hours + "h)");
    }

    @Override
    public void add(CatalogComponent catalogComponent) {

    }

    @Override
    public void remove(CatalogComponent catalogComponent) {

    }
}
