/**
 * BelahKetupat
 */
public class BelahKetupat extends BangunDatar {

    public BelahKetupat(int d1, int d2, int s ){
        double keliling,luas;
        luas = (d1 * d2)/2;
        keliling = s * 4;
        setKeliling(keliling);
        setLuas(luas);
        setName("BELAH KETUPAT");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}