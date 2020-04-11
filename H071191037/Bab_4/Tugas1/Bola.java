/**
 * Bola
 */
public class Bola extends BangunRuang {

    public Bola(double r){
        double luasPermukaan,volume;
        volume = (4 * (Math.PI * Math.pow(r, 3)))/3;
        luasPermukaan = 4 * Math.PI * Math.pow(r, 2);
        setVolume(volume);
        setLuasPermukaan(luasPermukaan);
        setName("BOLA");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}