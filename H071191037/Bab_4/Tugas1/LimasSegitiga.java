/**
 * LimasSegitiga
 */
public class LimasSegitiga extends BangunRuang {

    public LimasSegitiga(int a,int ts,int tl,int a1,int a2, int a3,int t1,int t2,int t3){
        double luasPermukaan,volume;
        volume = (((a*ts)/2) * tl)/3;
        luasPermukaan = ((a*ts)/2) + ((a1*t1)/2) + ((a2*t2)/2) + ((a3*t3)/2) ;
        setVolume(volume);
        setLuasPermukaan(luasPermukaan);
        setName("LIMAS SEGITIGA");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}