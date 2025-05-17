package DesignPatterns.ChainOfResponsibility.clase;

import java.util.ArrayList;
import java.util.List;

//Concrete Handler
public class FiltruPretMax implements IFiltru{
    private Float pretMax;
    private IFiltru next;

    public FiltruPretMax(Float pretMax) {
        this.pretMax = pretMax;
    }

    @Override
    public List<Carte> aplica(List<Carte> carti) {
        if(pretMax == null)
            return next == null ? carti : next.aplica(carti);

        List<Carte> cartiFiltratePret = new ArrayList<>();
        for(Carte c : carti)
            if(c.getPret() <= pretMax)
                cartiFiltratePret.add(c);

        if(next == null){
            return cartiFiltratePret;
        }else{
            return next.aplica(cartiFiltratePret);
        }
    }

    @Override
    public void setNext(IFiltru next) {
        this.next = next;
    }
}
