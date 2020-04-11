public class PrismaSegitiga extends BangunRuang {
    private double luasAlas, kelilingAlas, tinggi;

    public PrismaSegitiga(double luasAlas, double kelilingAlas, double tinggi) {
        this.luasAlas = luasAlas;
        this.kelilingAlas = kelilingAlas;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        double lp = (2 * luasAlas) + (kelilingAlas * tinggi);
        return lp;
    }

    public double volume() {
        double vol = luasAlas * tinggi;
        return vol;
    }
}