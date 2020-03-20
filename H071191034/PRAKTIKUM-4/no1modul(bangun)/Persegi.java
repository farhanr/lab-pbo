class Persegi extends BangunBangun{
    double sisi;

    Persegi(double sisi){
        this.sisi = sisi;
        show();
    }
    
        @Override
        double luas(){
            return sisi*sisi;
        }

    void show(){
        System.out.printf("luas persegi = %.2f\n", luas());
    }
}