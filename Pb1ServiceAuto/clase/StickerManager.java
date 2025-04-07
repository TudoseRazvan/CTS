package Pb1ServiceAuto.clase;

import java.util.HashMap;
import java.util.Map;

public class StickerManager {
    private Map<String, Sticker> cache = new HashMap<>();

    //Metoda pentru obtinerea unui sticker (din cache sau creat nou)
    public Sticker getSticker(IMasina masina){
        String key = masina.getModelMasina() + "_" + masina.getAnFabricatie();

        if(!cache.containsKey(key)){
            //Daca nu exista in cache, creaza un nou sticker
            System.out.println("Creare sticker nou pentru " + key);
            cache.put(key, new Sticker(masina));
        }else{
            System.out.println("Sticker gasit in cache pentru " + key);
        }

        //Returneaza o clona a stickerului din cache
        return cache.get(key).clone();
    }
}
