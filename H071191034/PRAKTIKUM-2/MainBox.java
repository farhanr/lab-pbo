import java.util.Scanner;
public class MainBox {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        double depth = input.nextDouble();
        double mass = input.nextDouble();

        Box box = new Box(height, width, depth);
        box.setMass(mass);
        System.out.println("Massa janis = "+box.getDensity());
        box.setMass(mass*2);
        System.out.println("Massa jenis = "+box.getDensity());
    }
}