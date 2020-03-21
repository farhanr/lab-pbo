class Kubus extends BangunBangun{
    double sisi;

    Kubus (double sisi){
        this.sisi = sisi;
        show();
    }
    
    @Override
        double luas(){
            return 6*sisi*sisi;
        }
        double volume(){
            return sisi*sisi*sisi;
        }

    void show(){
        System.out.printf("luas kubus = %.2f\n", luas());
        System.out.printf("volume kubus = %.2f\n", volume());
    }
}