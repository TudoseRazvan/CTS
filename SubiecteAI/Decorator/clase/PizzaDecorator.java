package SubiecteAI.Decorator.clase;

import java.util.List;

//Abstract Decorator
public abstract class PizzaDecorator implements IPizza{
    protected final IPizza pizza;

    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public List<String> getToppings() {
        return pizza.getToppings();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
