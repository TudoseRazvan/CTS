package DesignPatterns.Facade.program;

import DesignPatterns.Facade.clase.TravelFacade;

public class Main {
    public static void main(String[] args) {
        TravelFacade facade = new TravelFacade();
        facade.packageBooking("Ana Popescu", "Paris",5);
        facade.packageBooking("Mihai Popa","Viena",3);
    }
}
