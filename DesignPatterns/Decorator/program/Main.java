package DesignPatterns.Decorator.program;

import DesignPatterns.Decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        IBeverage order1 = new Milk(new Espresso());
        IBeverage order2 = new Caramel(new Milk(new Americano()));
        IBeverage order3 = new WhipCream(new Caramel(new Milk(new Americano())));

        System.out.printf("%s: %.2f RON%n", order1.getDescription(), order1.getPrice());
        System.out.printf("%s: %.2f RON%n", order2.getDescription(), order2.getPrice());
        System.out.printf("%s: %.2f RON%n", order3.getDescription(), order3.getPrice());
    }
}
