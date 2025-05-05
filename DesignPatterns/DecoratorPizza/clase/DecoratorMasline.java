package DecoratorPizza.clase;

public class DecoratorMasline extends DecoratorPizza {
    public DecoratorMasline(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescriere() {
        return pizza.getDescriere() + ", cu masline";
    }

    @Override
    public double getPret() {
        return pizza.getPret() + 3.0;
    }
}
