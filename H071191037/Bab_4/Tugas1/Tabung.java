/**
 * Tabung
 */
public class Tabung extends BangunRuang {

    public Tabung(double r, int t){
        double luasPermukaan,volume;
        volume = Math.PI * Math.pow(r, 2) * t;
        luasPermukaan = 2*Math.PI*r*(r+t);
        setVolume(volume);
        setLuasPermukaan(luasPermukaan);
        setName("TABUNG");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}