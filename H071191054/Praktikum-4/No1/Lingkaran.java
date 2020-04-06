public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public double luas() {
        double luas = Math.PI * Math.pow(jari, 2);
        return luas;
    }

    public double keliling() {
        double kel = Math.PI * (2 * jari);
        return kel;
    }
}
