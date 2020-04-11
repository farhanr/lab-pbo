public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        double luas = Math.pow(sisi, 2);
        return luas;
    }

    public double keliling() {
        double kel = 4 * sisi;
        return kel;
    }
}