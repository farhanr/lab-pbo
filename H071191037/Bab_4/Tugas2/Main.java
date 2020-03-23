/**
 * Main
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("====== masukkan kode =======");
        String keyword = input.next().toLowerCase();
        if(keyword.equals("123")){
            System.out.println("name");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("prodi");
            String prodi = input.nextLine();
            System.out.println("nim");
            String nim = input.next();
            PengurusInti pengurus = new PengurusInti(name, prodi, nim);
            
            pengurus.showIdentity();
        }
        else{
            System.out.println("name");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("prodi");
            String prodi = input.nextLine();
            System.out.println("nim");
            String nim = input.next();
            Staff staff = new Staff(name, prodi, nim);
            staff.showIdentity();
        }
    }
}