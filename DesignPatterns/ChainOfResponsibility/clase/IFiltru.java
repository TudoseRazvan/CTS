package DesignPatterns.ChainOfResponsibility.clase;

import java.util.List;

//Interfata Handler
public interface IFiltru {
    List<Carte> aplica(List<Carte> carti);
    void setNext(IFiltru next);
}
