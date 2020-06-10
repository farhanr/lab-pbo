public class Kerucut extends BangunRuang {
    private double jariJari;
    private double tinggi;
    private double selimut;

    public Kerucut(double jariJari, double tinggi, double selimut){
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.selimut = selimut;
    }

    @Override
    public double volume(){
        double volume = (Math.PI * Math.pow(jariJari, 2) * tinggi) / 3;
        return volume;
    }
    public double luasPermukaan(){
        double luasPermukaan = Math.PI * jariJari * (jariJari + selimut);
        return luasPermukaan;
    }

}