package Pb1ServiceAuto.clase;

public class Masina implements IMasina{
    private String modelMasina;
    private int anFabricatie;

    public Masina(String modelMasina, int anFabricatie) {
        this.modelMasina = modelMasina;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModelMasina() {
        return modelMasina;
    }

    @Override
    public int getAnFabricatie() {
        return anFabricatie;
    }
}
