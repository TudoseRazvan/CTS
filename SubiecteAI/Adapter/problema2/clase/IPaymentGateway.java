package SubiecteAI.Adapter.problema2.clase;

public interface IPaymentGateway {
    String pay(double amount);
    boolean validate(String transactionId);
}
