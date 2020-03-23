package Tugas_2;

public class Main {
    public static void main(String[] args) {
        Inti inti1 = new Inti (523,"H071171523","Nurwesi Rina Wahyudiani","Ketua");
        Inti inti2 = new Inti (502,"H071171502","Siti Nur Azizah","Wakil Ketua");

        Koordinator bidang1 = new Koordinator(501,"H071171501", "Iksora", "Ketua Bidang 1");
        Koordinator staff = new Koordinator(510,"H071171510", "Vitalia Eka Wardani G", "Staff BIdang 1");
        
        System.out.println("Berikut Daftar Keanggotaan UKM Programmer");
        System.out.println("");
        System.out.println("Anggota Inti");
        System.out.println("");
        inti1.Rincian();
        System.out.println("");
        inti2.Rincian();
        System.out.println("");
        System.out.println("Koordinator Bidang dan Staff");
        System.out.println("");
        bidang1.Rincian();
        System.out.println("");
        staff.Rincian();
        System.out.println("");
  
  }
}
