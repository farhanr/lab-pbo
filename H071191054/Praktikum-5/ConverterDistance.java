public class ConverterDistance extends Converter implements Distance {

    @Override
    public double metreToKilo(double value) {
        value /= Math.pow(10, 3);
        return value;
    }

    @Override
    public double metreToMilli(double value) {
        value *= Math.pow(10, 3);
        return value;
    }

    @Override
    public double inchToMetre(double value) {
        value *= 0.0254;
        return value;
    }

    @Override
    public void start() {
        System.out.println("Distance Converter is started");

    }

    @Override
    public void stop() {
        System.out.println("Distance Converter is terminated");

    }

}