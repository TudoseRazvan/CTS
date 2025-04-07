package Pb2SenzorDeCalitate.clase;

public class BuilderSensor implements IBuilder {
    String sensorId; //obligatoriu
    boolean hasPM25 = false;
    boolean hasPM10 = false;
    boolean hasVOC = false;
    boolean hasCO2 = false;
    boolean hasCO = false;
    boolean hasTemperature = false;
    boolean hasHumidity = false;

    //Constructor pentru Builder - primeste doar parametrul obligatoriu
    public BuilderSensor(String sensorId) {
        this.sensorId = sensorId;
    }

    @Override
    public AirQualitySensor build() {
        return new AirQualitySensor(this);
    }

    // Metode pentru setarea optionala a capabilitatilor (cu chaining)
    public BuilderSensor withPM25() {
        this.hasPM25 = true;
        return this;
    }

    public BuilderSensor withPM10() {
        this.hasPM10 = true;
        return this;
    }

    public BuilderSensor withVOC() {
        this.hasVOC = true;
        return this;
    }

    public BuilderSensor withCO2() {
        this.hasCO2 = true;
        return this;
    }

    public BuilderSensor withCO() {
        this.hasCO = true;
        return this;
    }

    public BuilderSensor withTemperature() {
        this.hasTemperature = true;
        return this;
    }

    public BuilderSensor withHumidity() {
        this.hasHumidity = true;
        return this;
    }
}
