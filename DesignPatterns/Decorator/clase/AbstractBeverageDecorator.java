package DesignPatterns.Decorator.clase;

//Decorator abstract (AbstractDecorator) -> Obligatoriu implementeaza Component
public abstract class AbstractBeverageDecorator implements IBeverage{
    protected final IBeverage beverage; //Obligatoriu protected

    protected AbstractBeverageDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public float getPrice() {
        return beverage.getPrice();
    }
}
