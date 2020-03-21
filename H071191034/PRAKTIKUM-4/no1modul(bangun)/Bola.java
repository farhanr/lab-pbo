class Bola extends BangunBangun{
    private double r;

    Bola(double r){
        this.r = r;
        show();
    }

    @Override
        double luas(){
            return 4*Math.PI*r*r;
        }
        double volume(){
            return (4/3)*Math.PI*r*r*r;
        }

    void show(){
        System.out.printf("luas bola = %.2f\n",luas());
        System.out.printf("volume bola = %.2f\n", volume());
    }
}
