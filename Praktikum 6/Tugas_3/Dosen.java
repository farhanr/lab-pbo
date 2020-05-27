package Tugas_3;

public class Dosen extends SistemInformasiAkademik{
    public Dosen(String dosen){
        super(dosen);
    }
    @Override
    public void isiData(){
        System.out.println("Dosen : "+dosen);
    }
}

