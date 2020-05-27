package Tugas_1;

public class Main{
    public static void main(String[] args) {
        Staf staff = new Staf("Gibs", 20);
        Dosen dosen = new Dosen("Akbar",12);
        Pegawai pegawai = new Pegawai("Rio");

        System.out.println(staff.getName() + " mendapatkan gaji sebesar: Rp." + staff.getGaji() + ",-");
        System.out.println(dosen.getName() + " mendapatkan gaji sebesar: Rp." + dosen.getGaji() + ",-");
        System.out.println(pegawai.getName()+" mendapatkan gaji sebesar: Rp."+pegawai.getGaji()+",-");
    }
}