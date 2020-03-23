/**
 * PrismaSegitiga
 */
public class PrismaSegitiga extends BangunRuang {

    public PrismaSegitiga(int a,int ts,int tp){
        double luasPermukaan,volume;
        volume = ((a*ts)/2)*tp;
        luasPermukaan = (2*((a*ts)/2)) + (3 * tp * ts);
        setLuasPermukaan(luasPermukaan);
        setVolume(volume);
        setName("PRISMA SEGITIGA");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}