package DecoratorPizza.clase;

public class DecoratorSalam extends DecoratorPizza {
    public DecoratorSalam(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescriere() {
        return pizza.getDescriere() + ", cu salam";
    }

    @Override
    public double getPret() {
        return pizza.getPret() + 6.0;
    }
}
