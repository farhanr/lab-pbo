public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double keliling(){
        double keliling = 2 * (panjang + lebar);
        return keliling;
    }
    public double luas(){
        double luas = panjang * lebar;
        return luas;
    }
}