package Tugas_3;

public class SistemInformasiAkademik {
    String nim;
    String nama;
    String matkul;
    int sks;
    String dosen;
    double uts;
    double uas;

    public SistemInformasiAkademik() {
    }
   
    public SistemInformasiAkademik(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    public SistemInformasiAkademik(String matkul, int sks){
        this.matkul = matkul;
        this.sks = sks;
    }
    public SistemInformasiAkademik(String dosen){
        this.dosen = dosen;
    }
    public SistemInformasiAkademik(double uts, double uas){
        this.uts = uts;
        this.uas = uas;
    }
    public void isiData(){
        System.out.println("Sistem Akademik");
        System.out.println("----------------------------");
    }
}