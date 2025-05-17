package DesignPatterns.Adapter.program;

import DesignPatterns.Adapter.clase.ExternalPaymentProcessor;
import DesignPatterns.Adapter.clase.IPayment;
import DesignPatterns.Adapter.clase.PaymentAdapter;

public class Main {
    public static void main(String[] args) {
        IPayment paymentGateway = new PaymentAdapter(new ExternalPaymentProcessor());

        paymentGateway.payInvoice(250.0f);
        paymentGateway.payInvoice(1250.f);
    }
}
