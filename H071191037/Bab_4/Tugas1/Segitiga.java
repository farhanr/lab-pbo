/**
 * Segitiga
 */
public class Segitiga extends BangunDatar {

    public Segitiga(int alas, int tinggi,int a,int b, int c){
        double luas,keliling;
        luas = (alas * tinggi)/2;
        setLuas(luas);
        keliling = a + b + c;
        setKeliling(keliling);
        setName("SEGITIGA");
    }
    
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}