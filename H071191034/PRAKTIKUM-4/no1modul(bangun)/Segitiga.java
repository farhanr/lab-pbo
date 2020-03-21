class Segitiga extends BangunBangun{
    double alas, tinggi;

    Segitiga (double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        show();
    }
    
    @Override
        double luas(){
            return alas*tinggi;
        }

    void show(){
        System.out.printf("luas segitiga = %.2f\n", luas());
    }
}