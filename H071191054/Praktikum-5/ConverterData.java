public class ConverterData extends Converter implements Data {

    @Override
    public long teraToGiga(long value) {
        value *= 1024;
        return value;
    }

    @Override
    public long teraToMega(long value) {
        value *= Math.pow(1024, 2);
        return value;
    }

    @Override
    public long teraToKilo(long value) {
        value *= Math.pow(1024, 3);
        return value;
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