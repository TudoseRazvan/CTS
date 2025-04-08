package Recapitulare.FactoryMethod.clase;

public class FactoryPizzaRoma implements IFactory{

    @Override
    public IPizza crearePizza() {
        return new PizzaRoma();
    }
}
