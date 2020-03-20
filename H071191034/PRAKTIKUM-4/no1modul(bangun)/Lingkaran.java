class Lingkaran extends BangunBangun{
    double r;

    Lingkaran(double r){
        this.r = r;
        show();
    }
    
    @Override
        double luas(){
            return 2 * 3.14 *r*r;
        }

    void show(){
        System.out.printf("luas lingkaran = %.2f\n", luas());
    }
}