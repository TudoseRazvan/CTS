package DecoratorPizza.clase;

public class PizzaMargarita implements IPizza {
    @Override
    public String getDescriere() {
        return "Pizza Margarita";
    }

    @Override
    public double getPret() {
        return 20.0;
    }
}