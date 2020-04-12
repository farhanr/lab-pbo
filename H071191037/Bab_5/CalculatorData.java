interface Data{
    public long teraToGiga(long value);
    public long teraToMega(long value);
    public long teraToKilo(long value);
}

public class CalculatorData extends Converter implements Data {

    @Override
    public long teraToGiga(long value) {
        return value *= 1024;
    }

    @Override
    public long teraToMega(long value) {
        return (long) (value * (Math.pow(1024, 2)));
    }

    @Override
    public long teraToKilo(long value) {
        return (long) (value * (Math.pow(1024, 3)));
    }

    @Override
    public void start() {
        System.out.println("Data Converter is started");
    }

    @Override
    public void stop() {
        System.out.println("Data Converter is terminated");
    }

}