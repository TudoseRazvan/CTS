package Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.decorator.clase;

public class Magazin implements IModCalculator{
    @Override
    public double calculeazaTotal(Cos cos, Adresa adresa) {
        double sumaProduse = cos.getTotalProduse();
        double costTransport = adresa.calculeazaCostTransport();
        double total = sumaProduse + costTransport;

        System.out.println("Total fara discount pentru client: "
            + cos.getClient().getNume() + ": " + total);

        return total;
    }
}
