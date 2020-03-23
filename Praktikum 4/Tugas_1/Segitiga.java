package Tugas_1;

public class Segitiga extends Datar {
    
    float alas;
    float tinggi;
    float sisi;

    @Override
    float luas() {
        float luas = (alas * tinggi)/2;;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }   

    @Override
    float keliling(){
        float keliling = 3*sisi;
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return keliling;
    }
    
}
