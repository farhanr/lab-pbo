public class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari){
        this.jariJari = jariJari;
    }
    
    @Override
    public double volume(){
        double volume = 4/3 * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }
    public double luasPermukaan(){
        double luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
        return luasPermukaan;
    }

}