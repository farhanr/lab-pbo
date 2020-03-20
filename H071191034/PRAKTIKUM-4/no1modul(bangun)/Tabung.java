class Tabung extends BangunBangun{
    private double r,tinggi;

    Tabung (double r, double tinggi){
        this.r = r;
        this.tinggi = tinggi;
        show();
    }

    @Override
        double luas(){
            return (2*Math.PI*r*r*tinggi)+(2*Math.PI*r);
        }
        double volume(){
            return Math.PI*r*r*tinggi;
        }

    void show(){
        System.out.printf("luas tabung = %.2f\n",luas());
        System.out.printf("volume tabung = %.2f\n",volume());
    }
}