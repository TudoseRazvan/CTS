package SubiecteAI.Facade.clase;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD Player on");
    }
    public void off(){
        System.out.println("DVD Player off");
    }
    public void play(String movie){
        System.out.println("DVD Player: playing \"" + movie + "\"");
    }
    public void stop() {
        System.out.println("DVD Player: stopped");
    }
}