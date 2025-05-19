package SubiecteAI.Adapter.problema1.clase;

public class SensorAdapter implements ISensor{
    private final ThirdPartySensor adaptee;

    public SensorAdapter(ThirdPartySensor adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double readCelsius() {
        double kelvin = adaptee.readTempKelvin();
        double celsius = kelvin - 273.15;
        System.out.println("Adapter: convertesc " + kelvin + " grade K in: " + celsius + " grade Celsius");
        return celsius;
    }
}
