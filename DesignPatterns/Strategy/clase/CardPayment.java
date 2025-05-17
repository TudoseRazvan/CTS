package DesignPatterns.Strategy.clase;

//Concrete Strategy
public class CardPayment implements IPaymentStrategy {
    @Override
    public void pay(float amountLei) {
        System.out.println("Plata de " + amountLei + " RON a fost platita cu cardul");
    }
}
