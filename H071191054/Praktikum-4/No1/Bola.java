public class Bola extends BangunRuang {
    private double jari;

    public Bola(double jari) {
        this.jari = jari;
    }

    @Override
    public double luasPermukaan() {
        double lp = 4 * Math.PI * Math.pow(jari, 2);
        return lp;
    }

    public double volume() {
        double vol = 4 / 3 * Math.PI * Math.pow(jari, 3);
        return vol;
    }
}