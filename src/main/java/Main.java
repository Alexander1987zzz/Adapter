public class Main {

    public static void main(String[] args) {



        AdapterSensor adapterSensor = new AdapterSensor(new TemperatureSensor());
        adapterSensor.getPressure();
        adapterSensor.getTemperature();


    }
}
