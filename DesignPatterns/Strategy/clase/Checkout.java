package DesignPatterns.Strategy.clase;

//Context
public class Checkout {
    private IPaymentStrategy strategy; //PRIVATE
    private final float amount;

    public Checkout(float amount, IPaymentStrategy strategy) {
        this.strategy = strategy;
        this.amount = amount;
    }

    public void setStrategy(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(){
        strategy.pay(amount);
    }
}
