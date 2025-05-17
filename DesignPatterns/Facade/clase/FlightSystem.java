package DesignPatterns.Facade.clase;

public class FlightSystem {
    void bookFlights(String client, String destination){
        System.out.printf("FlightSystem -> Zbor dus-intors catre %s pentru %s%n",destination, client);
    }
}
