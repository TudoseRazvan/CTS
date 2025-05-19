package SubiecteAI.Adapter.problema2.program;

import SubiecteAI.Adapter.problema2.clase.IPaymentGateway;
import SubiecteAI.Adapter.problema2.clase.PaymentGatewayFactory;

public class Main {
    public static void main(String[] args) {
        String gatewayType = "secure";
        IPaymentGateway gateway = PaymentGatewayFactory.create(gatewayType);

        String txId = gateway.pay(250.0);
        if(gateway.validate(txId)){
            System.out.println("Plata a fost procesata cu succes!");
        }else{
            System.out.println("Plata a esuat!");
        }
    }
}
