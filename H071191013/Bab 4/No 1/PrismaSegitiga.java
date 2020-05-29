public class PrismaSegitiga extends BangunRuang {
    private double luasAlas;
    private double kelilingAlas;
    private double tinggi;

    public PrismaSegitiga(double luasAlas, double kelilingAlas, double tinggi){
        this.luasAlas = luasAlas;
        this.kelilingAlas = kelilingAlas;
        this.tinggi = tinggi;
    }

    @Override
    public double volume(){
        double volume = luasAlas * tinggi;
        return volume;
    }
    public double luasPermukaan(){
        double luasPermukaan = (2 * luasAlas) + (kelilingAlas * tinggi);
        return luasPermukaan;
    }


}