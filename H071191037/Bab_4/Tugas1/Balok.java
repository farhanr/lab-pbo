/**
 * Balok
 */
public class Balok extends BangunRuang {

    public Balok(int p ,int l , int t){
        double luasPermukaan,volume;
        volume = p*l*t;
        luasPermukaan = 2 * ((p*l) + (p*t) + (l*t));
        setLuasPermukaan(luasPermukaan);
        setVolume(volume);
        setName("BALOK");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}