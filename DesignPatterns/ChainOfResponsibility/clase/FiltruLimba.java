package DesignPatterns.ChainOfResponsibility.clase;

import java.util.ArrayList;
import java.util.List;

//Concrete Handler
public class FiltruLimba implements IFiltru{
    private String limba;
    private IFiltru next;

    public FiltruLimba(String limba) {
        this.limba = limba;
    }

    @Override
    public List<Carte> aplica(List<Carte> carti) {
        if(limba == null || limba.isBlank())
            return next == null ? carti : next.aplica(carti);

        List<Carte> cartiFiltrateLimba = new ArrayList<>();
        for(Carte c : carti)
            if(c.getLimba().equalsIgnoreCase(limba))
                cartiFiltrateLimba.add(c);

        return next == null ? cartiFiltrateLimba : next.aplica(cartiFiltrateLimba);
    }

    @Override
    public void setNext(IFiltru next) {
        this.next = next;
    }
}
