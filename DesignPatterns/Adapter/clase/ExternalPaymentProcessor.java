package DesignPatterns.Adapter.clase;

//Biblioteca externa (nu se modifica)
public class ExternalPaymentProcessor {
    public void makePayment(double valueRON){
        System.out.println("External gateway processed " + valueRON + " RON");
    }
}


