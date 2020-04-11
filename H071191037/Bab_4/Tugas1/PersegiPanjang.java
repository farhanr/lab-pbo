/**
 * PersegiPanjang
 */
public class PersegiPanjang extends BangunDatar {

    public PersegiPanjang(int panjang,int lebar){
        double luas,keliling;
        luas = panjang * lebar;
        keliling = 2*(panjang + lebar);
        setKeliling(keliling);
        setLuas(luas);
        setName("PERSEGI PANJANG");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}