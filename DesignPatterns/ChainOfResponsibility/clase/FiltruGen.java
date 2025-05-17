package DesignPatterns.ChainOfResponsibility.clase;

import java.util.ArrayList;
import java.util.List;

//Concrete Handler
public class FiltruGen implements IFiltru{
    private String gen;
    private IFiltru next;

    public FiltruGen(String gen) {
        this.gen = gen;
    }

    @Override
    public List<Carte> aplica(List<Carte> carti) {
        if(gen == null || gen.isBlank()) {
            return next == null ? carti : next.aplica(carti);
        }

        List<Carte> cartiFiltrateGen = new ArrayList<>();
        for(Carte c : carti)
            if(c.getGen().equals(gen))
                cartiFiltrateGen.add(c);

        return next == null ? cartiFiltrateGen : next.aplica(cartiFiltrateGen);
    }

    @Override
    public void setNext(IFiltru next) {
        this.next = next;
    }
}
