package DesignPatterns.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

//FlyweightFactory
public class SeatFactory {
    private static final Map<String, ISeat> cache = new HashMap<>(); //PRIVATE STATIC MAP

    public static ISeat getSeat(String type){
        return cache.computeIfAbsent(type, t -> switch (t){
            case "STANDARD" -> new Seat("STANDARD", "grey");
            case "ERGONOMIC" -> new Seat("ERGONOMIC","blue");
            case "VIP" -> new Seat("VIP","red");
            default -> throw new IllegalArgumentException("Unknown type");
        });
    }

    public static int getCreatedSeats(){
        return cache.size();
    }
}
