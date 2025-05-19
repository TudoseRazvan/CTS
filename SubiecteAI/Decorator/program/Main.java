package SubiecteAI.Decorator.program;

import SubiecteAI.Decorator.clase.CheeseDecorator;
import SubiecteAI.Decorator.clase.IPizza;
import SubiecteAI.Decorator.clase.OlivesDecorator;
import SubiecteAI.Decorator.clase.PizzaSimpla;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PIZZA SIMPLA ===");
        IPizza pizzaSimpla = new PizzaSimpla();
        System.out.println("Toppings: " + pizzaSimpla.getToppings());

        System.out.println("\n=== PIZZA CU CASCAVAL ===");
        IPizza pizzaCuCascaval = new CheeseDecorator(
                        new PizzaSimpla());

        System.out.println("Toppings: " + pizzaCuCascaval.getToppings());
        System.out.println("Total cost: " + pizzaCuCascaval.getCost());

        System.out.println("\n=== PIZZA CU CASCAVAL SI CU MASLINE ===");
        IPizza pizzaCuDeToate = new OlivesDecorator(
                    new CheeseDecorator(
                        new PizzaSimpla()));

        System.out.println("Toppings: " + pizzaCuDeToate.getToppings());
        System.out.println("Total cost: " + pizzaCuDeToate.getCost());
    }
}
