package Tugas_1;

public class Balok extends Ruang {
    float panjang, lebar, tinggi;
    
    @Override
    float luas(){
        float luas = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    @Override
    float volume(){
        float volume = panjang*lebar*tinggi;
        System.out.println("Volume Persegi: " + volume);
        return volume;
    }
}
