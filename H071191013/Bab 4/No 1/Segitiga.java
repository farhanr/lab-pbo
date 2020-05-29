public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double keliling(){
        double keliling = alas + tinggi + sisiMiring;
        return keliling;
    }
    public double luas(){
        double luas = (alas * tinggi)/2;
        return luas;
    }
}