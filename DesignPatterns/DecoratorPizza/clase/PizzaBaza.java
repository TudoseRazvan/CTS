package DecoratorPizza.clase;

public class PizzaBaza implements IPizza {
    @Override
    public String getDescriere() {
        return "Pizza de baza";
    }

    @Override
    public double getPret() {
        return 15.0;
    }
}