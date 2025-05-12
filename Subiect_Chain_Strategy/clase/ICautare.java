package Subiect_Chain_Strategy.clase;

import java.util.List;

//Interfata pentru cautare - > Chain Of Responsibility
public interface ICautare {
    List<Produs> filtreaza(List<Produs> produse);
    void setUrmatorulCriteriu(ICautare urmatorulCriteriu);
}
