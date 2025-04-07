package Pb4SenzorCalitateFactory.clase;

public class HealthRiskAirQualityReport implements AbstractAirQualityReport {
    @Override
    public void afiseazaRaport() {
        System.out.println("Raport: Risc asupra sanatatii. Calitatea aerului este slaba. Evitati expunerea prelungita!");
    }
}
