class Prisma extends BangunBangun{
    double luasAlas, keliling, tinggi, sisiA, sisiB;
    
    Prisma (double luasAlas, double keliling, double tinggi, double sisiA, double sisiB){
        this.luasAlas = luasAlas;
        this.keliling = keliling;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        show();
    }
    
    @Override
        double luas(){
            return (2*luasAlas) + (keliling*tinggi);
        }
        double volume(){
            return (1/2) *sisiA*sisiB;
        }

    void show(){
        System.out.printf("luas prisma = %.2f\n",luas());
        System.out.printf("volume prisma = %.2f\n",volume());
    }
}