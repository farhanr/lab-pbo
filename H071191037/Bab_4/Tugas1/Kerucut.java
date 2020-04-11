/**
 * Kerucut
 */
public class Kerucut extends BangunRuang {

    public Kerucut(double r,int t,int s){
        double luasPermukaan,volume;
        volume = (Math.PI * Math.pow(r,2) * t)/3;
        luasPermukaan = (Math.PI * Math.pow(r, 2)) + (Math.PI * r * s);
        setLuasPermukaan(luasPermukaan);
        setVolume(volume);
        setName("KEUCUT");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}