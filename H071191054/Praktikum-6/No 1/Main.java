import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Staff: ");
        String staffName = sc.nextLine();
        System.out.print("Jumlah Kehadiran: ");
        int presence = sc.nextInt();
        Staff staff = new Staff(staffName, presence);

        System.out.print("Nama Dosen: ");
        sc.nextLine();
        String lecName = sc.nextLine();
        System.out.print("Jumlah SKS: ");
        int sks = sc.nextInt();
        Dosen dosen = new Dosen(lecName, sks);

        System.out.print("Nama Pegawai: ");
        sc.nextLine();
        String empName = sc.nextLine();
        Pegawai pegawai = new Pegawai(empName);

        System.out.println();
        staff.totalSalary(staffName, presence);
        dosen.totalSalary(lecName, sks);
        pegawai.totalSalary(empName);
    }
}
