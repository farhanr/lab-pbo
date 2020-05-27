package Tugas_3;

public class Mahasiswa extends SistemInformasiAkademik{
    public Mahasiswa(String nama, String nim){
        super(nama, nim);
    }
    @Override
    public void isiData(){
        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
    }
}