interface Temperature{
    public double celciusToFahrenheit(double value);
    public double celciusToKelvin(double value);
}

public class CalculatorTemperature extends Converter implements Temperature {

    @Override
    public double celciusToFahrenheit(double value) {
        return ((value * 9)/5) + 32;
    }

    @Override
    public double celciusToKelvin(double value) {
        return value + 273.15;
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