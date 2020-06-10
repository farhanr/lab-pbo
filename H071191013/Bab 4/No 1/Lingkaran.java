public class Lingkaran extends BangunDatar{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    @Override
    public double keliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
    public double luas(){
        double luas = Math.PI * Math.pow(jariJari, 2);
        return luas;
    }
}