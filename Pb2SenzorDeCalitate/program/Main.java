package Pb2SenzorDeCalitate.program;

import Pb2SenzorDeCalitate.clase.AbstractAirQualitySensor;
import Pb2SenzorDeCalitate.clase.BuilderSensor;

public class Main {
    public static void main(String[] args) {
        //Creaza 3 senzori diferite - fiecare intr-o singura linie de cod

        //Senzor complet
        AbstractAirQualitySensor senzorComplet = new BuilderSensor("SenzorPremium")
                .withPM25().withPM10().withVOC().withCO2().withCO().withTemperature().withHumidity()
                .build();

        AbstractAirQualitySensor senzorParticule = new BuilderSensor("SenzorParticule")
                .withPM25().withPM10().withTemperature()
                .build();

        AbstractAirQualitySensor senzorGaze = new BuilderSensor("SenzorGaze")
                .withVOC().withCO2().withCO()
                .build();

        System.out.println("=== Lista senzorilor creati! ===");
        senzorComplet.displayCapabilities();
        System.out.println();
        senzorParticule.displayCapabilities();
        System.out.println();
        senzorGaze.displayCapabilities();
        System.out.println();
    }
}
