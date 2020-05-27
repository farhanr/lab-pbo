package Tugas_3;

public class MataKuliah extends SistemInformasiAkademik{
    public MataKuliah(String matkul, int sks){
        super(matkul, sks);
    }
    @Override
    public void isiData(){
        System.out.println("Mata Kuliah : "+matkul);
        System.out.println("SKS : "+sks);
    }
}