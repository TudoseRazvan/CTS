package SubiecteAI.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private static final Map<Type, IMarker> cache = new HashMap<>();

    static {
        cache.put(Type.BUS, new Marker("BUS.png",Type.BUS));
        cache.put(Type.BUILDING, new Marker("BUILDING.png",Type.BUILDING));
        cache.put(Type.PARKING, new Marker("PARKING.png",Type.PARKING));
    }

    public static IMarker getMarker(Type type){
        //presupunem ca nu extindem enumeratia si ne limitam la cele initiale
        return cache.getOrDefault(type, null);
    }

    public static int count(){
        return cache.size();
    }

}
