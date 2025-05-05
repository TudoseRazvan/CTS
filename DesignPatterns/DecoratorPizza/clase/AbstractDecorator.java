package DecoratorPizza.clase;

abstract class DecoratorPizza implements IPizza {
    protected IPizza pizza;

    public DecoratorPizza(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescriere() {
        return pizza.getDescriere();
    }

    @Override
    public double getPret() {
        return pizza.getPret();
    }
}