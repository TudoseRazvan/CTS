package Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.decorator.clase;

public class Adresa {
    private final String strada;
    private final double costTransport;

    public Adresa(String strada, double costTransport) {
        this.strada = strada;
        this.costTransport = costTransport;
    }

    public double calculeazaCostTransport(){
        System.out.println("Cost transport pentru " + strada + ": " + costTransport);
        return costTransport;
    }
}
