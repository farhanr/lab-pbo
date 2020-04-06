public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luasPermukaan() {
        double lp = 6 * (Math.pow(sisi, 2));
        return lp;
    }

    public double volume() {
        double vol = Math.pow(sisi, 3);
        return vol;
    }
}