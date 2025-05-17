package DesignPatterns.Facade.clase;

public class InsuranceSystem {
    void createPolicy(String client, String destination, int nights){
        System.out.printf("InsuranceSystem -> Polita %d zile pentru %s in %s%n",nights,client,destination);
    }
}
