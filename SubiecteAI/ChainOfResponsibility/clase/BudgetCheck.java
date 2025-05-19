package SubiecteAI.ChainOfResponsibility.clase;

public class BudgetCheck extends CheckAbstract{
    @Override
    public void handle(Request request) {
        boolean ok = request.getCostEstimativ() <= 5000;
        System.out.println("BudgetCheck > " + (ok ? "OK" : "Peste buget"));
        if(ok)
            forward(request);
    }
}
