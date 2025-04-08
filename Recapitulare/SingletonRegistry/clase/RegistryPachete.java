package Recapitulare.SingletonRegistry.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistryPachete {
    private static Map<String, IPachetTuristic> collection = new HashMap<>();
    private RegistryPachete(){

    }

    public static void register(String nume, IPachetTuristic valoare) throws Exception{
        if(!collection.containsKey(nume))
            collection.put(nume,valoare);
        else
            throw new Exception("Cheie "+ nume + " deja inregistrata!");
    }

    public static IPachetTuristic getPachet(String nume){
        return collection.get(nume);
    }

}
