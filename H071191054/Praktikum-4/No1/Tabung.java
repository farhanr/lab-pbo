public class Tabung extends BangunRuang {
    private double jari, tinggi;

    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        double lp = 2 * Math.PI * jari * (jari + tinggi);
        return lp;
    }

    public double volume() {
        double vol = Math.PI * Math.pow(jari, 2) * tinggi;
        return vol;
    }
}