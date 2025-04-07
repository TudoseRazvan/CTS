package Pb2SenzorDeCalitate.clase;

public class AirQualitySensor extends AbstractAirQualitySensor{
    private final String sensorId;
    private final boolean hasPM25;
    private final boolean hasPM10;
    private final boolean hasVOC;
    private final boolean hasCO2;
    private final boolean hasCO;
    private final boolean hasTemperature;
    private final boolean hasHumidity;


    public AirQualitySensor(BuilderSensor builder){
        this.sensorId = builder.sensorId;
        this.hasPM25 = builder.hasPM25;
        this.hasPM10 = builder.hasPM10;
        this.hasVOC = builder.hasVOC;
        this.hasCO2 = builder.hasCO2;
        this.hasCO = builder.hasCO;
        this.hasTemperature = builder.hasTemperature;
        this.hasHumidity = builder.hasHumidity;
    }

    @Override
    public String getSensorId() {
        return sensorId;
    }

    @Override
    public void displayCapabilities() {
        System.out.println("Senzor " + sensorId + " capabilitati:");
        if (hasPM25) System.out.println(" - Masurare PM2.5");
        if (hasPM10) System.out.println("- Masurare PM10");
        if (hasVOC) System.out.println("- Masurare VOC");
        if (hasCO2) System.out.println("- Masurare CO2");
        if (hasCO) System.out.println("- Masurare CO");
        if (hasTemperature) System.out.println("- Masurare temperatura");
        if (hasHumidity) System.out.println("- Masurare umiditate");
    }

    public boolean isHasPM25() {
        return hasPM25;
    }

    public boolean isHasPM10() {
        return hasPM10;
    }

    public boolean isHasVOC() {
        return hasVOC;
    }

    public boolean isHasCO2() {
        return hasCO2;
    }

    public boolean isHasCO() {
        return hasCO;
    }

    public boolean isHasTemperature() {
        return hasTemperature;
    }

    public boolean isHasHumidity() {
        return hasHumidity;
    }
}
