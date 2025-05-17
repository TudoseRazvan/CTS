package DesignPatterns.Facade.clase;

public class HotelSystem {
    void reserveRoom(String client, String destination, int nights){
        System.out.printf("HotelSystem -> Rezervare %d nopti la %s pentru %s%n", nights, destination, client);
    }
}
