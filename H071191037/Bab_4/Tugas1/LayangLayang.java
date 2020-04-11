/**
 * LayangLayang
 */
public class LayangLayang extends BangunDatar{

    public LayangLayang(int d1,int d2, int a, int b , int c , int d){
        double keliling,luas;
        luas = (d1 * d2)/2;
        keliling = a + b + c + d;
        setKeliling(keliling);
        setLuas(luas);
        setName("LAYANG - LAYANG");
    }
    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}