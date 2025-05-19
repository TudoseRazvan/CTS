package SubiecteAI.ChainOfResponsibility.clase;

public class ResponsibleCheck extends CheckAbstract{
    @Override
    public void handle(Request request) {
        System.out.println("ResponsibleCheck > cererea #" + request.getId()
            + " repartizata responsabilului de departament.");
        //Ultimul din lant - nu mai apeleaza forward()
    }
}
