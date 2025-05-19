package SubiecteAI.Adapter.problema2.clase;

import java.util.Random;

public class SecurePay {
    public int startSecureTransaction(double value){
        int id = new Random().nextInt(100_000);
        System.out.println("SecurePay: starting transaction of " + value + ", ID: " + id);
        return id;
    }

    public boolean verifySecureTransaction(int id){
        System.out.println("SecurePay: verifying transaction ID: " + id);
        return true;
    }
}
