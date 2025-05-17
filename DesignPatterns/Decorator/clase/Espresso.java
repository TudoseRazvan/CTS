package DesignPatterns.Decorator.clase;


//Produs de baza -> ConcreteComponent
public class Espresso implements IBeverage{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public float getPrice() {
        return 8.0f;
    }
}
