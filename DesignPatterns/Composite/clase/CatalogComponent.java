package DesignPatterns.Composite.clase;

public interface CatalogComponent {
    public void add(CatalogComponent catalogComponent);
    public void remove(CatalogComponent catalogComponent);
    public abstract int getStudyHours(); //total ore
    public abstract void print(String indent);
}
