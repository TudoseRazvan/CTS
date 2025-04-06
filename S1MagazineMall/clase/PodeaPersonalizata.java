package S1MagazineMall.clase;

public class PodeaPersonalizata {
    private String tip;
    private double duritate;

    public PodeaPersonalizata(String tip, double duritate) {
        this.tip = tip;
        this.duritate = duritate;
    }

    public double getDuritate() {
        return duritate;
    }

    @Override
    public String toString() {
        return "PodeaPersonalizata{" +
                "tip='" + tip + '\'' +
                ", duritate=" + duritate +
                '}';
    }
}
