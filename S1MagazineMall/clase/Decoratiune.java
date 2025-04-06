package S1MagazineMall.clase;

public class Decoratiune {
    private String nume;
    private MaterialTip material;

    public Decoratiune(String nume, MaterialTip material) {
        this.nume = nume;
        this.material = material;
    }

    public MaterialTip getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Decoratiune{" +
                "nume='" + nume + '\'' +
                ", material=" + material +
                '}';
    }
}
