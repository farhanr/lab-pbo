public class BangunDatar{
    private String name;
    private double luas;
    private double keliling;

    public void setName(String name) {
        this.name = name;
    }

    public void setLuas(double luas){
        this.luas = luas;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
    
    public String getName() {
        return name;
    }

    public double getKeliling() {
        return keliling;
    }

    public double getLuas() {
        return luas;
    }
    public void info(){
        System.out.printf("+------------------------------------+\n");
        System.out.printf("  %s\n",getName());
        System.out.printf("  Luas \t\t= %.1f cm^2\n",getLuas());
        System.out.printf("  keliling \t= %.1f cm\n",getKeliling());
        System.out.printf("+------------------------------------+\n");
    }
}