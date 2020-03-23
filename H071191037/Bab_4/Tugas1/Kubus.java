/**
 * Kubus
 */
public class Kubus extends BangunRuang{
    public Kubus(int sisi){
        double luasPermukaan,volume;
        luasPermukaan = 6 * (sisi * sisi);
        volume = Math.pow(sisi, 3);
        setLuasPermukaan(luasPermukaan);
        setVolume(volume);
        setName("KUBUS");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
    
}