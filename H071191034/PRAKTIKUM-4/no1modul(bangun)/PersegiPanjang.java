class PersegiPanjang extends BangunBangun{
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        show();
    }
    
    @Override
        double luas(){
            return panjang*lebar;
        }
    
    void show(){
        System.out.printf("luas persegi panjang = %.2f\n", luas());
    }
}