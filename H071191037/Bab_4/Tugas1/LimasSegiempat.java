/**
 * LimasSegiempat
 */
public class LimasSegiempat extends BangunRuang {

    public LimasSegiempat(int p, int l, int t,int a1,int a2, int a3, int a4,int t1, int t2,int t3,int t4){
        double luasPermukaan,volume;
        volume = ((p*l)*t)/3;
        luasPermukaan = (p*l) + ((a1*t1)/2) + ((a2*t2)/2) + ((a3*t3)/2) + ((a4*t4));
        setVolume(volume);
        setLuasPermukaan(luasPermukaan);
        setName("LIMAS SEGI EMPAT");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}