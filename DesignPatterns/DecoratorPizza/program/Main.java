package DecoratorPizza.program;

import DecoratorPizza.clase.*;

public class Main {
    public static void main(String[] args) {
        // Pizza de baza
        IPizza pizzaSimpla = new PizzaBaza();
        System.out.println("Pizza simpla:");
        System.out.println("Descriere: " + pizzaSimpla.getDescriere());
        System.out.println("Pret: " + pizzaSimpla.getPret() + " lei");
        System.out.println();

        // Adauga cascaval
        IPizza pizzaCuCascaval = new DecoratorCascaval(pizzaSimpla);
        System.out.println("Pizza cu cascaval:");
        System.out.println("Descriere: " + pizzaCuCascaval.getDescriere());
        System.out.println("Pret: " + pizzaCuCascaval.getPret() + " lei");
        System.out.println();

        // Pizza Margarita
        IPizza margarita = new PizzaMargarita();

        // Adauga mai multe ingrediente pe pizza Margarita
        IPizza superPizza = new DecoratorSalam(
                new DecoratorMasline(
                        new DecoratorCascaval(margarita)));

        System.out.println("Pizza Margarita decorata:");
        System.out.println("Descriere: " + superPizza.getDescriere());
        System.out.println("Pret: " + superPizza.getPret() + " lei");
        System.out.println();

        // Exemplu de combinatie diferita
        IPizza pizzaSpeciala = new DecoratorSalam(
                new DecoratorMasline(
                        new PizzaBaza()));

        System.out.println("Pizza speciala:");
        System.out.println("Descriere: " + pizzaSpeciala.getDescriere());
        System.out.println("Pret: " + pizzaSpeciala.getPret() + " lei");
    }
}
