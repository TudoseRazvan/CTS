package Recapitulare.PrototypeFactory.program;

import Recapitulare.PrototypeFactory.clase.IProdus;
import Recapitulare.PrototypeFactory.clase.PrototypeFactory;
import Recapitulare.PrototypeFactory.clase.Telefon;

public class Main {
    public static void main(String[] args) {
        PrototypeFactory.inregistreaza("laptop",new Telefon("Dell XPS",5999.99));
        PrototypeFactory.inregistreaza("telefon", new Telefon("iPhone 16", 6999.99));

        IProdus laptop1 = PrototypeFactory.creeaza("laptop");
        IProdus telefon1 = PrototypeFactory.creeaza("telefon");



        if(laptop1!=null)
            laptop1.afiseaza();
        if(telefon1!=null)
            telefon1.afiseaza();

        PrototypeFactory.inregistreaza("telefonHighEnd", new Telefon("Samsung Galaxy S24 Ultra",5699.99));
        IProdus telefon2 = PrototypeFactory.creeaza("telefonHighEnd");
        if(telefon2 != null)
            telefon2.afiseaza();

        IProdus laptop2 = laptop1.clone();
        laptop2.afiseaza();
    }
}
