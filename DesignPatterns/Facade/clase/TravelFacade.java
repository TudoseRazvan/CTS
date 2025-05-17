package DesignPatterns.Facade.clase;

//Facade implementeaza obligatoriu subsistemele sale
// si adauga metoda de creare a sistemului complex
public class TravelFacade {
    private final HotelSystem hotel = new HotelSystem(); //PRIVATE
    private final FlightSystem flight = new FlightSystem();
    private final InsuranceSystem insurance = new InsuranceSystem();

    public void packageBooking(String client, String destination, int nights){
        hotel.reserveRoom(client,destination,nights);
        flight.bookFlights(client,destination);
        insurance.createPolicy(client,destination,nights);
        System.out.println("TravelFacade -> Pachet complet finalizat!");
    }
}
