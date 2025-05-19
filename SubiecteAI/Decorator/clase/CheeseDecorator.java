package SubiecteAI.Decorator.clase;

import java.util.List;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(IPizza pizza) {
        super(pizza);
        pizza.getToppings().add("Cheese");
    }

    @Override
    public List<String> getToppings() {
        return pizza.getToppings();
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10.00;
    }
}
