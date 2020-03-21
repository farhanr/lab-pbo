class Balok extends BangunBangun{
    double panjang, lebar, tinggi;

    Balok (double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        show();
    }
    
    @Override
        double luas(){
            return 2*((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
        }
        double volume(){
            return panjang*lebar*tinggi;
        }

    void show(){
        System.out.printf("luas balok = %.2f\n",luas());
        System.out.printf("volume balok = %.2f\n",volume());
    }
}