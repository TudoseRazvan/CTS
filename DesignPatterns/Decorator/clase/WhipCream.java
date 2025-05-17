package DesignPatterns.Decorator.clase;

//ConcreteDecorator
public class WhipCream extends AbstractBeverageDecorator{
    public WhipCream(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip cream";
    }

    @Override
    public float getPrice() {
        return beverage.getPrice() + 1.5f;
    }
}
