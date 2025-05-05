package Decorator.clase;

public class PizzaRoma implements IPizza{
    @Override
    public String getListaIngrediente() {
        return "Blat, Sos Rosii, Ciuperci";
    }

    @Override
    public double getPret() {
        return 25.5;
    }
}
