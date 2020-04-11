import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double heigth = sc.nextDouble();
        double depth = sc.nextDouble();
        double mass = sc.nextDouble();
        Box box = new Box(width, heigth, depth);
        box.setMass(mass);
        System.out.println("Massa Jenis = " + box.getDensity());
        box.setMass(mass*2);
        System.out.println("Massa Jenis = " + box.getDensity());
        
    }

    
}