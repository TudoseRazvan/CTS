package DesignPatterns.Strategy.clase;

//Concrete Strategy
public class PaypalPayment implements IPaymentStrategy{
    @Override
    public void pay(float amountLei) {
        System.out.println("Plata de " + amountLei + " RON a fost platita prin Paypal");
    }
}
