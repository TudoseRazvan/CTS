package Pb3JocVideo.clase;

public class Pozitie {
    private int x;
    private int y;

    public Pozitie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean esteInApropriere(Pozitie altaPozitie){
        return Math.abs(this.x - altaPozitie.x) <= 1 && Math.abs(this.y - altaPozitie.y) <= 1;
    }
}
