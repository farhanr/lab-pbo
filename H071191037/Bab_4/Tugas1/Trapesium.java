/**
 * Trapesium
 */
public class Trapesium extends BangunDatar {

    public Trapesium(int sisiA,int sisiB,int tinggi,int a,int b,int c, int d){
        double keliling,luas;
        luas = ((sisiA + sisiB) * tinggi)/2;
        setLuas(luas);
        keliling = a + b + c + d;
        setKeliling(keliling);
        setName("TRAPESIUM");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}