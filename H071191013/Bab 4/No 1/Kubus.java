public class Kubus extends BangunRuang{
    private double sisi;
    
    public Kubus(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double volume(){
        double volume = Math.pow(sisi, 3);
        return volume;
    }
    public double luasPermukaan(){
        double luasPermukaan = 6 * Math.pow(sisi, 2);
        return luasPermukaan;
    }
}