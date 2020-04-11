package Tugas_1;

public class Trapesium extends Datar {
    
    //a,b sisi yang sejajar
    //t tinggi
    float a, b, t;
    //A,B,C,D seluruh sisi trapesium
    float A,B,C,D;
    
    @Override
    float luas(){
        float luas = ((a+b)*t)/2;
        System.out.println("Luas trapesium: " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = (A*B)+(B*C)+(C*D)+(D*A);
        System.out.println("Keliling trapesium: " + keliling);
        return keliling;
    }
}
