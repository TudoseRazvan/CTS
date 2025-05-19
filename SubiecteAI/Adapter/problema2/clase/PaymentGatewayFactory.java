package SubiecteAI.Adapter.problema2.clase;

public class PaymentGatewayFactory {
    public static IPaymentGateway create(String type){
        switch (type.toLowerCase()){
            case "fast":
                return new FastPayAdapter(new FastPay());
            case "secure":
                return new SecurePayAdapter(new SecurePay());
            default:
                throw new IllegalArgumentException("Unknown payment gateway: " + type);
        }
    }
}
