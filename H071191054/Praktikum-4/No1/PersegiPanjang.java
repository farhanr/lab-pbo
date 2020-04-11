public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        double luas = panjang * lebar;
        return luas;
    }

    public double keliling() {
        double kel = 2 * (panjang + lebar);
        return kel;
    }
}