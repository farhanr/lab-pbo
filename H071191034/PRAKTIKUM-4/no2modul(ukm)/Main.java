import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner rex = new Scanner(System.in);

        System.out.println("====UKM Programmer Unhas====");
        System.out.print("\nInput kode : ");
        // 1 untuk pengurus inti, 2 untuk koordinator
        int kode1 = rex.nextInt();
        if (kode1 == 1){
            System.out.print("\nInput kode bagian : ");
            int kode2 = rex.nextInt();
            if (kode2 == 1){
                System.out.print("Nama ? ");
                String nama = rex.next();
                System.out.print("NIM ? ");
                String nim = rex.next();
                System.out.print("E-mail ? ");
                String email = rex.next();
                System.out.print("Prodi ? "); 
                String prodi = rex.next();
                PengurusInti pinti = new PengurusInti(nama, nim, email, prodi);
                pinti.showData();
                System.out.println("Jabatan : "+pinti.ketua()); 
                System.out.println("========================================");
            } else if(kode2 == 2){
                System.out.print("Nama ? ");
                String nama = rex.next();
                System.out.print("NIM ? ");
                String nim = rex.next();
                System.out.print("E-mail ? ");
                String email = rex.next();
                System.out.print("Prodi ? "); 
                String prodi = rex.next();
                PengurusInti pinti = new PengurusInti(nama, nim, email, prodi);
                pinti.showData();
                System.out.println("Jabatan : "+pinti.sekertaris()); 
                System.out.println("========================================");
            } else if (kode2 == 3){
                System.out.print("Nama ? ");
                String nama = rex.next();
                System.out.print("NIM ? ");
                String nim = rex.next();
                System.out.print("E-mail ? ");
                String email = rex.next();
                System.out.print("Prodi ? "); 
                String prodi = rex.next();
                PengurusInti pinti = new PengurusInti(nama, nim, email, prodi);
                pinti.showData();
                System.out.println("Jabatan : "+pinti.bendahara()); 
                System.out.println("========================================");
            } else {
                System.out.println("Salah Kode");
            }
        } else if (kode1 == 2){
            System.out.print("\nInput kode bagian : ");
            int kode3 = rex.nextInt();
            if (kode3 == 1){
                System.out.print("Nama ? ");
                String nama = rex.next();
                System.out.print("NIM ? ");
                String nim = rex.next();
                System.out.print("E-mail ? ");
                String email = rex.next();
                System.out.print("Prodi ? "); 
                String prodi = rex.next();
                KoordStaff koStaff = new KoordStaff(nama, nim, email, prodi);
                koStaff.showData();
                System.out.println("Jabatan : "+koStaff.humas());
                System.out.println("========================================");
            } else if (kode3 == 2){
                System.out.print("Nama ? ");
                String nama = rex.next();
                System.out.print("NIM ? ");
                String nim = rex.next();
                System.out.print("E-mail ? ");
                String email = rex.next();
                System.out.print("Prodi ? "); 
                String prodi = rex.next();
                KoordStaff koStaff = new KoordStaff(nama, nim, email, prodi);
                koStaff.showData();
                System.out.println("Jabatan : "+koStaff.saPrasarana());
                System.out.println("========================================");
            } else if (kode3 == 3){
                System.out.print("Nama ? ");
                String nama = rex.next();
                System.out.print("NIM ? ");
                String nim = rex.next();
                System.out.print("E-mail ? ");
                String email = rex.next();
                System.out.print("Prodi ? "); 
                String prodi = rex.next();
                KoordStaff koStaff = new KoordStaff(nama, nim, email, prodi);
                koStaff.showData();
                System.out.println("Jabatan : "+koStaff.konsul());
                System.out.println("========================================");
            } else {
                System.out.println("Salah Kode");
            }
        } else {
            System.out.println("Salah Kode");
        } 
    rex.close();             
    }
}