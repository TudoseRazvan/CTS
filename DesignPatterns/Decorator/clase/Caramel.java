package DesignPatterns.Decorator.clase;


//ConcreteDecorator
public class Caramel extends AbstractBeverageDecorator{
    public Caramel(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", caramel";
    }

    @Override
    public float getPrice() {
        return beverage.getPrice() + 2.5f;
    }
}
