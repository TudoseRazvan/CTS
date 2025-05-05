package DecoratorPizza.clase;

public class DecoratorCascaval extends DecoratorPizza {
    public DecoratorCascaval(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescriere() {
        return pizza.getDescriere() + ", cu cascaval suplimentar";
    }

    @Override
    public double getPret() {
        return pizza.getPret() + 4.0;
    }
}
