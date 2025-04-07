package Pb4SenzorCalitateFactory.clase;

public class CleanAirQualityReport implements AbstractAirQualityReport {
    @Override
    public void afiseazaRaport() {
        System.out.println("Raport: Aer curat. Calitatea aerului este buna");
    }
}
