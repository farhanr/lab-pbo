public class LayangLayang extends BangunDatar {
    private double diagonal1;
    private double diagonal2;
    private double sisiA;
    private double sisiB;

    public LayangLayang(double diagonal1, double diagonal2, double sisiA, double sisiB){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    @Override
    public double keliling(){
        double keliling = 2 * (sisiA + sisiB);
        return keliling;
    }
    public double luas(){
        double luas = diagonal1 * diagonal2 * 2;
        return luas;
    }

}