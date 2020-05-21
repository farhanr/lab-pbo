import java.util.Scanner;

/**
 * MenghitungGaji
 */
public class MenghitungGaji {
    String staffname,dosenName,pegawaiName;
    int valueStaff,valuedosen;

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        Pegawai pegawai = new Pegawai();
        Staff staff = new Staff();
        Scanner inp = new Scanner(System.in);

        System.out.print("Nama Staff ::> ");
        staff.setName(inp.next());
        System.out.print("Jumlah Kehadiran ::> ");
        staff.setKehadiran(inp.nextInt());
        System.out.print("Nama Dosen ::> ");
        dosen.setName(inp.next());
        System.out.print("Jumlah SKS ::> ");
        dosen.setSks(inp.nextInt());
        System.out.print("Nama Pegawai ::> ");
        pegawai.setName(inp.next());
        inp.close();

        System.out.printf("%s mendapatkan gaji Rp. %d\n",staff.getName(),staff.getGaji());
        System.out.printf("%s mendapatkan gaji Rp. %d\n",dosen.getName(),dosen.getGaji());
        System.out.printf("%s mendapatkan gaji Rp. %d\n",pegawai.getName(),pegawai.getGaji());
    }
}

