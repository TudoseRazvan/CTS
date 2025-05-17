package DesignPatterns.Strategy.program;

import DesignPatterns.Strategy.clase.CardPayment;
import DesignPatterns.Strategy.clase.Checkout;
import DesignPatterns.Strategy.clase.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        Checkout order = new Checkout(150, new CardPayment());
        order.processPayment();

        order.setStrategy(new PaypalPayment());
        order.processPayment();
    }
}
