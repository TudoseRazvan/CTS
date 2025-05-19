package SubiecteAI.ChainOfResponsibility.program;

import SubiecteAI.ChainOfResponsibility.clase.BudgetCheck;
import SubiecteAI.ChainOfResponsibility.clase.DateCheck;
import SubiecteAI.ChainOfResponsibility.clase.Request;
import SubiecteAI.ChainOfResponsibility.clase.ResponsibleCheck;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateCheck h1 = new DateCheck();
        BudgetCheck h2 = new BudgetCheck();
        ResponsibleCheck h3 = new ResponsibleCheck();
        h1.setNext(h2);
        h2.setNext(h3);

        List<Request> cereri = List.of(
                new Request(1, "Upgrade PC",           1200),
                new Request(2, "Curățenie laborator",   700),
                new Request(3, "Înlocuire UPS server", 6000),
                new Request(4, "Reparație prize",       300)
        );

        for (Request r : cereri) {
            System.out.println("=== Procesez cererea " + r.getId() + " ===");
            h1.handle(r);
        }

    }
}
