package Recapitulare.FactoryMethod.clase;

public class FactoryPizzaVegetariana implements IFactory{
    @Override
    public IPizza crearePizza() {
        return new PizzaVegetariana();
    }
}
