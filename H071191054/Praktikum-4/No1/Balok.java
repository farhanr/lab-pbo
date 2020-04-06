public class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        double lp = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        return lp;
    }

    public double volume() {
        double vol = panjang * lebar * tinggi;
        return vol;
    }
}