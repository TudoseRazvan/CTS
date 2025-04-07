package Pb4SenzorCalitateFactory.clase;

public class WarningAirQualityReport implements AbstractAirQualityReport{
    @Override
    public void afiseazaRaport() {
        System.out.println("Raport: Avertizare! Calitatea aerului este moderata. Fii precaut!");
    }
}
