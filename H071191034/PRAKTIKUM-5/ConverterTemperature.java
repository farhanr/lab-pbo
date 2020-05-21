
public class ConverterTemperature extends Converter implements Temperature {

    @Override
    public double celciusToFahrenheit(double value) {
        return ((9*value)/5) + 32;
    }

    @Override
    public double celciusToKelvin(double value) {
        return value + 273.15;
    }

    @Override
    public void start() {
        System.out.println("Temperature converter starts");

    }

    @Override
    public void stop() {
        System.out.println("Temperatur converter ends");

    }



}