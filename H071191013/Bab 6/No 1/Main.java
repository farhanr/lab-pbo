import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Staf staf = new Staf();
        // Pegawai pegawai = (Pegawai) staf;
        Pegawai pegawai = new Pegawai();
        Dosen dosen = new Dosen();

        //admin --> Pegawai --> dosen;staf
        
        System.out.print("Nama Staf        : " );
        String nama1 = sc.nextLine();
        System.out.print("Jumlah Kehadiran :  ");
        int value = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Dosen        : ");
        String nama2 = sc.nextLine();
        System.out.print("Jumlah SKS        : ");
        int val = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nama Pegawai      : ");
        String nama3 = sc.nextLine();
        int value3 = 0;

        System.out.println();
        staf.bonus(nama1, value);
        dosen.bonus(nama2, val);
        pegawai.bonus(nama3, value3);
        
    }
}