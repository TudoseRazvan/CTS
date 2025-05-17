package DesignPatterns.Adapter.clase;

//ConcreteAdapter -> implementeaza obligatoriu Adapter-ul
public class PaymentAdapter implements IPayment{
    private final ExternalPaymentProcessor processor; //Obligatoriu private

    public PaymentAdapter(ExternalPaymentProcessor processor) {
        this.processor = processor;
    }

    //Metoda obligatoriu -> Leaga Adaptee
    @Override
    public void payInvoice(float amountLei) {
        // conversie + delegare
        processor.makePayment(amountLei);
    }
}
