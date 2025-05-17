package DesignPatterns.Composite.clase;

import java.util.ArrayList;
import java.util.List;

//Composite - Categorie (poate contine fii)
public class Categorie implements CatalogComponent{
    private final String name;
    private final List<CatalogComponent> children = new ArrayList<>();

    public Categorie(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        children.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        children.remove(catalogComponent);
    }

    @Override
    public int getStudyHours() {
        return children.stream()
                .mapToInt(CatalogComponent::getStudyHours)
                .sum();
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "* " + name + " [" + getStudyHours() + "h]");
        children.forEach(catalogComponent -> catalogComponent.print(indent + "   "));
    }
}
