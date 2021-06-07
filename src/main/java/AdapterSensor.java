public class AdapterSensor extends PressureSensor{

    private TemperatureSensor temperatureSensor;

    public AdapterSensor(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    public void getTemperature() {
        temperatureSensor.getTemperature();
    }
}
