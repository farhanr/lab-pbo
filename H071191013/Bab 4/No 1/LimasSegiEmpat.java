public class LimasSegiEmpat extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;

    public LimasSegiEmpat(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double volume(){
        double volume = panjang * lebar * tinggi / 3;
        return volume;
    }
    public double luasPermukaan(){
        double luasPermukaan = (panjang * lebar) + Math.sqrt((Math.pow(panjang/2, 2)) + (Math.pow(lebar/2, 2)));
        return luasPermukaan;
    }
}