import java.util.Scanner;
public class Main {
    static Scanner rex = new Scanner(System.in);
    public static void main(String[] args) {
        Staf staf = new Staf();
        // Pegawai pegawai = (Pegawai) staf;
        Pegawai pegawai = new Pegawai();
        Dosen dosen = new Dosen();

        //admin --> Pegawai --> dosen;staf
        
        System.out.print("Nama Staf         ::> " );
        String name = rex.nextLine();
        System.out.print("Jumlah kehadiran  ::> ");
        int value = rex.nextInt();
        rex.nextLine();

        System.out.print("Nama Dosen        ::> ");
        String nama = rex.nextLine();
        System.out.print("Jumlah SKS        ::> ");
        int val = rex.nextInt();
        rex.nextLine();
        
        System.out.print("Nama Pegawai      ::> ");
        String name3 = rex.nextLine();
        int value3 = 0;

        System.out.println();
        staf.bonus(name, value);
        dosen.bonus(nama, val);
        pegawai.bonus(name3, value3);
        
    }
}