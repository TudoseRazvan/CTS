package SubiecteAI.Adapter.problema2.clase;

public class FastPayAdapter implements IPaymentGateway{
    private final FastPay fastPay;

    public FastPayAdapter(FastPay fastPay) {
        this.fastPay = fastPay;
    }

    @Override
    public String pay(double amount) {
        return fastPay.initiateFastPayment(amount);
    }

    @Override
    public boolean validate(String transactionId) {
        return fastPay.confirmFastPayment(transactionId);
    }
}
