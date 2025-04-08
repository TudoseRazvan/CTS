package Recapitulare.FactoryMethod.program;

import Recapitulare.FactoryMethod.clase.FactoryPizzaRoma;
import Recapitulare.FactoryMethod.clase.IFactory;
import Recapitulare.FactoryMethod.clase.IPizza;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new FactoryPizzaRoma();

        IPizza pizza = factory.crearePizza();

        pizza.afisareDescriere();
    }
}
