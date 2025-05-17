package DesignPatterns.Decorator.clase;

//Produs de baza -> ConcreteComponent
public class Americano implements IBeverage{
    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public float getPrice() {
        return 9.5f;
    }
}
