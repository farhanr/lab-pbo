package Tugas_1;

public class PrismaSegitiga extends Ruang {
    float alas, tinggi, ts;
    //ts = tinggi segitiga
    
    @Override
    float luas(){
        float luas = ts * (alas + (3*tinggi));
        System.out.println("Luas Prisma: " + luas);
        return luas;
    }

    @Override
    float volume(){
        float volume = (alas * ts * tinggi)/2;
        System.out.println("Volume Prisma: " + volume);
        return volume;
    }
}
