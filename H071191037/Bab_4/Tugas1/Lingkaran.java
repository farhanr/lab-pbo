/**
 * Lingkaran
 */
public class Lingkaran extends BangunDatar{

    public Lingkaran(double r){
        double keliling,luas;
        luas = Math.PI * Math.pow(r, 2);
        keliling = Math.PI * (r * 2);
        setKeliling(keliling);
        setLuas(luas);
        setName("LINGKARAN");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}