package S5Restaurant.clase;

public class Preparat {
    private String denumire;
    private int timpGatire;
    private int gradeNecesare;

    public Preparat(String denumire, int timpGatire, int gradeNecesare) {
        this.denumire = denumire;
        this.timpGatire = timpGatire;
        this.gradeNecesare = gradeNecesare;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getTimpGatire() {
        return timpGatire;
    }

    public int getGradeNecesare() {
        return gradeNecesare;
    }
}
