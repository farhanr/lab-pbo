package Tugas_2;

public class Koordinator extends Anggota {
    int ID;
    String NIM;
    String Nama;
    String Jabatan;
    
    public Koordinator (int id, String nim, String nama, String jabatan) {
        super (id, nim, nama, jabatan);
        ID = id;
        NIM = nim;
        Nama = nama;
        Jabatan = jabatan;
    }

    //methode
    public void Rincian() {
        System.out.println("ID = " + ID);
        System.out.println("NIM = " + NIM);
        System.out.println("Nama Hewan = " + Nama);
        System.out.println("Keterangan = " + Jabatan);
    } 
}