package SubiecteAI.Decorator.clase;

import java.util.List;

public class OlivesDecorator extends PizzaDecorator{
    public OlivesDecorator(IPizza pizza) {
        super(pizza);
        pizza.getToppings().add("Masline");
    }

    @Override
    public List<String> getToppings() {
        return pizza.getToppings();
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5.00;
    }
}
