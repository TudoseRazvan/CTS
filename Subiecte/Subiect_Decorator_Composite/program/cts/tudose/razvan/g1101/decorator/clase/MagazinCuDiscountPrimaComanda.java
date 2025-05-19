package Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.decorator.clase;

import java.util.HashSet;
import java.util.Set;

public class MagazinCuDiscountPrimaComanda extends MagazinDecorator{
    private Set<String> clientiCuDiscount = new HashSet<>();

    public MagazinCuDiscountPrimaComanda(IModCalculator magazinReal) {
        super(magazinReal);
    }

    @Override
    public double calculeazaTotal(Cos cos, Adresa adresa) {
        String idClient = cos.getClient().getId();
        double totalFaraDiscount = magazinReal.calculeazaTotal(cos, adresa);
        if(!clientiCuDiscount.contains(idClient)){
            clientiCuDiscount.add(idClient);
            double totalCuDiscount = totalFaraDiscount * 0.9;
            System.out.println("Se aplica discount 10% pentru prima comanda a clientului: "
                + cos.getClient().getNume() + ": " + totalCuDiscount);
            return totalCuDiscount;
        }else{
            System.out.println("Clientul a facut deja o comanda => Fara discount pentru comanda clientului: "
                + cos.getClient().getNume() + ". Total = " +totalFaraDiscount);
            return totalFaraDiscount;
        }
    }
}
