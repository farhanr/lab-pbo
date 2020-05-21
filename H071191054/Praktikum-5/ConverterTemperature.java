public class ConverterTemperature extends Converter implements Temperature {

    @Override
    public double celciusToFahrenheit(double value) {
        value = ((value * 9) / 5) + 32;
        return value;
    }

    @Override
    public double celciusToKelvin(double value) {
        value += 273.15;
        return value;
    }

    @Override
    public void start() {
        System.out.println("Temperature Converter is started");
    }

    @Override
    public void stop() {
        System.out.println("Temperature Converter is terminated");

    }

}