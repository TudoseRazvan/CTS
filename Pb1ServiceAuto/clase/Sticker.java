package Pb1ServiceAuto.clase;

public class Sticker implements Cloneable{
    private double lungime;
    private double latime;
    private String modelMasina;
    private int anFabricatie;

    //Constructor care necesita consultarea producatorilor
    public Sticker(IMasina masina) {
        this.modelMasina = masina.getModelMasina();
        this.anFabricatie = masina.getAnFabricatie();

        System.out.println("Consultare producator pentru " + modelMasina + ", an " + anFabricatie);
        this.lungime = calculeazaLungime(modelMasina, anFabricatie);
        this.latime = calculeazaLatime(modelMasina, anFabricatie);
    }

    private double calculeazaLungime(String model, int an){
        return model.length() * 10.5 + an * 0.01;
    }

    private double calculeazaLatime(String model, int an){
        return model.length() * 5.2 + an * 0.005;
    }

    @Override
    public Sticker clone() {
        try{
            return (Sticker) super.clone();
        }
        catch (CloneNotSupportedException e){
            return null;
        }
    }

    public double getLungime() {
        return lungime;
    }

    public double getLatime() {
        return latime;
    }

    public String getModelMasina() {
        return modelMasina;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                ", modelMasina='" + modelMasina + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
