package SubiecteAI.Facade.clase;

public class HomeTheaterFacade {
    private final Amplifier amplifier = new Amplifier();
    private final DvdPlayer dvd = new DvdPlayer();
    private final Projector projector = new Projector();
    private final TheaterLights lights = new TheaterLights();
    private final Screen screen = new Screen();

    public void watchMovie(String movieTitle){
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        dvd.on();
        dvd.play(movieTitle);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvd.stop();
        dvd.off();
        amplifier.off();
        projector.off();
        screen.up();
        lights.on();
    }
}
