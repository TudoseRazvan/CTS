package SubiecteAI.Adapter.problema1.program;

import SubiecteAI.Adapter.problema1.clase.ISensor;
import SubiecteAI.Adapter.problema1.clase.SensorAdapter;
import SubiecteAI.Adapter.problema1.clase.ThirdPartySensor;

public class Main {
    public static void main(String[] args) {
        ISensor sensor = new SensorAdapter(new ThirdPartySensor());

        System.out.println("Temperatura 1: " + sensor.readCelsius());
        System.out.println("Temperatura 2: " + sensor.readCelsius());
        System.out.println("Temperatura 3: " + sensor.readCelsius());

    }
}
