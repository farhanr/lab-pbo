package Tugas_1;

public class Bola extends Ruang {
    float r;
    
    @Override
    float luas(){
        float luas = (float) ((4/3)*Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }

    @Override
    float volume(){
        float volume = (float) ((4/3) * Math.PI * Math.pow(r, 3));
        System.out.println("Volume Lingkaran: " + volume);
        return volume;
    }
}
