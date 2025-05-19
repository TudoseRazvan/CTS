package SubiecteAI.Facade.program;

import SubiecteAI.Facade.clase.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();
    }
}
