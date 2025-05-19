package SubiecteAI.Decorator.clase;

import java.util.ArrayList;
import java.util.List;

//Concrete Component
public class PizzaSimpla implements IPizza{
    private final List<String> toppings = new ArrayList<>();

    public PizzaSimpla() {
        toppings.add("Sos de rosii");
        toppings.add("Porumb");
        toppings.add("Salam");
        toppings.add("Sunca");
    }

    @Override
    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public double getCost() {
        return 30.00; //Pret de baza
    }
}
