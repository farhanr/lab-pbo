public class ConverterTemperature extends Converter implements Temperature {
    @Override
    public void start() {
        System.out.println("Temperature Converter is started");
    }
    @Override
    public void stop() {
        System.out.println("Distance Converter is terminated");
    }
    @Override
    public double celciusToFahrenheit(double value) {
        return (value*9/5) + 32;
    }
    @Override
    public double celciusToKelvin(double value) {
        return value + 273.15;
    }
} 
