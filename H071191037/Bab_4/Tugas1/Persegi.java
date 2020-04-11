/**
 * Persegi
 */
public class Persegi extends BangunDatar {
    
    public Persegi(int sisi){
        double keliling,luas;
        keliling = sisi * 4;
        luas = sisi * sisi; 
        setKeliling(keliling);
        setLuas(luas);
        setName("PERSEGI");
    }

    @Override
    public void info() {
        // TODO Auto-generated method stub
        super.info();
    }
}