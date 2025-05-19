package SubiecteAI.Adapter.problema2.clase;

import java.util.UUID;

public class FastPay {
    public String initiateFastPayment(double amount) {
        String id = "FAST-" + UUID.randomUUID();
        System.out.println("FastPay: initiating payment of " + amount + ", transaction ID: " + id);
        return id;
    }
    // Confirma plata pentru ID-ul dat
    public boolean confirmFastPayment(String transactionId) {
        System.out.println("FastPay: confirming transaction " + transactionId);
        return true;
    }
}
