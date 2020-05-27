package Tugas_1;

public class Kubus extends Ruang {
    float sisi;
    
    @Override
    float luas(){
        float luas = 6*(sisi * sisi);
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    @Override
    float volume(){
        float volume = sisi *sisi * sisi * sisi;
        System.out.println("Keliling Persegi: " + volume);
        return volume;
    }
}
