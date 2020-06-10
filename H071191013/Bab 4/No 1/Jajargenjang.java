public class Jajargenjang extends BangunDatar{
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public Jajargenjang(double alas, double tinggi, double sisiMiring){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }
    
    @Override
    public double keliling(){
        double keliling = 2 * (alas + sisiMiring);
        return keliling;
    }
    public double luas(){
        double luas = alas * tinggi;
        return luas;
    }
}