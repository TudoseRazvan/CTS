package SubiecteAI.Adapter.problema2.clase;

public class SecurePayAdapter implements IPaymentGateway{
    private final SecurePay securePay;

    public SecurePayAdapter(SecurePay securePay) {
        this.securePay = securePay;
    }

    @Override
    public String pay(double amount) {
        int txId = securePay.startSecureTransaction(amount);
        return String.valueOf(txId);
    }

    @Override
    public boolean validate(String transactionId) {
        int id = Integer.parseInt(transactionId);
        return securePay.verifySecureTransaction(id);
    }
}
