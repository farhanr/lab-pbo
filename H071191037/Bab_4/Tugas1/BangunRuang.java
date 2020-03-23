/**
 * BangunRuang
 */
public class BangunRuang {
    private double luasPermukaan,volume;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }
    
    public String getName() {
        return name;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }
    public void info(){
        System.out.printf("+------------------------------------+\n");
        System.out.printf("  %s\n",getName());
        System.out.printf("  Volume \t\t= %.1f cm^2\n",getVolume());
        System.out.printf("  Luas Permukaan \t= %.1f cm\n",getLuasPermukaan());
        System.out.printf("+------------------------------------+\n");
    }
}