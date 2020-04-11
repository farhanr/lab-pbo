/**
 * Jajargenjang
 */
public class Jajargenjang extends BangunDatar {

    public Jajargenjang(int alas,int tinggi,int a,int b,int c,int d){
        double luas,keliling;
        luas = alas * tinggi;
        keliling = a + b + c + d;
        setKeliling(keliling);
        setLuas(luas);
        setName("JAJARGENJANG");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}