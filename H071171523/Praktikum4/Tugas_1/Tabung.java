package Tugas_1;

public class Tabung extends Ruang {
    float r, tinggi;
    
    @Override
    float luas(){
        float luas = (float) ((float) (2 * Math.PI * r * r) + (Math.PI * (2 * Math.PI * r) * tinggi));
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }

    @Override
    float volume(){
        float volume = (float) (Math.PI * r * r * tinggi);
        System.out.println("Volume Lingkaran: " + volume);
        return volume;
    }
}
