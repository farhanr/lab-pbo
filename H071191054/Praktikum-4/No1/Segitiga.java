public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi1, sisi2;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    @Override
    public double luas() {
        double luas = (alas * tinggi) / 2;
        return luas;
    }

    public double keliling() {
        double kel = alas + sisi1 + sisi2;
        return kel;
    }
}