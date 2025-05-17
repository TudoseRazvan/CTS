package DesignPatterns.Decorator.clase;

//ConcreteDecorator -> extinde AbstractDecorator OBLIGATORIU
public class Milk extends AbstractBeverageDecorator{
    public Milk(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk"; //Trebuie obiectul beverage
    }

    @Override
    public float getPrice() {
        return super.getPrice() + 2.5f;
    }
}
