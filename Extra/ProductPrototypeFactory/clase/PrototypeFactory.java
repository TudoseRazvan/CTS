package Extra.ProductPrototypeFactory.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static final Map<String, IProdus> prototipuri = new HashMap<>();

    public static void inregistreaza(String tip, IProdus prototip){
        prototipuri.put(tip, prototip);
    }

    public static IProdus creeaza(String tip){
        IProdus prototip = prototipuri.get(tip);
        if (prototip!= null){
            return prototip.clone();
        }else{
            System.out.println("Tipul " + tip + " nu a fost gasit!");
            return null;
        }
    }
}
