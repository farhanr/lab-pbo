
public class Trapesium extends BangunDatar {
    private double sisiAtas;
    private double sisiBawah;
    private double tinggi;
    private double sisiMiring;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double sisiMiring){
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double keliling(){
        double keliling = sisiAtas + sisiBawah + (2 * sisiMiring);
        return keliling;
    }
    public double luas(){
        double luas = ((sisiAtas + sisiBawah) * tinggi) / 2;
        return luas;
    }

}