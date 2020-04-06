public class Trapesium extends BangunDatar {
    private double tinggi, sisiSejajar1, sisiSejajar2, sisiLain;

    public Trapesium(double tinggi, double sisiSejajar1, double sisiSejajar2, double sisiLain) {
        this.tinggi = tinggi;
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.sisiLain = sisiLain;
    }

    @Override
    public double luas() {
        double luas = ((sisiSejajar1 + sisiSejajar2) * tinggi) / 2;
        return luas;
    }

    public double keliling() {
        double kel = tinggi + sisiSejajar1 + sisiSejajar2 + sisiLain;
        return kel;
    }
}