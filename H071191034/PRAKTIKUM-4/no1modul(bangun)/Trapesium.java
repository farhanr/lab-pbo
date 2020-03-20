class Trapesium extends BangunBangun{
    double sisiA, sisiB, tinggi;

    Trapesium(double sisiA, double sisiB, double tinggi){
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.tinggi = tinggi;
        show();
    }
    
    @Override
        double luas(){
            return (1/2)*(sisiA+sisiB)*tinggi;
        }

    void show(){
        System.out.printf("luas trapesium = %.2f\n",luas());
    }
}