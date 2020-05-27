package Tugas_3;

public class Main {
    public static void main(String[]args){
        SistemInformasiAkademik sia = new SistemInformasiAkademik();
        Mahasiswa mahasiswa = new Mahasiswa("Sangereng Dewa Raja", "H13116306");
        MataKuliah matkul = new MataKuliah("Pemrograman Berorientasi Objek",3);
        Dosen dosen = new Dosen("Shoffin");
        Nilai nilai = new Nilai(85, 80);
        nilai.hitung();
    
        sia.isiData();
        sia = mahasiswa;
        sia.isiData();
        sia = matkul;
        sia.isiData();
        sia = dosen;
        sia.isiData();
        sia = nilai;
        sia.isiData();
    }
}