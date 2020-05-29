public class Tabung extends BangunRuang{
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi){
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        return volume;
    }
    public double luasPermukaan(){
        double luasPermukaan = (2 * Math.PI * Math.pow(jariJari, 2)) + (2 * Math.PI * jariJari * tinggi);
        return luasPermukaan;
    }

}