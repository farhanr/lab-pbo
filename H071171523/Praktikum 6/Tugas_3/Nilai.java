package Tugas_3;

public class Nilai extends SistemInformasiAkademik{
    double nilaiAkhir = 0.0;
    char angka;
    
    public Nilai(double uts, double uas){
        super(uts, uas);
    }

    public void hitung(){
        nilaiAkhir = (uts+uas)/2;
        
        if(nilaiAkhir>80)
            angka = 'A';
        else if(nilaiAkhir>70)
            angka = 'B';
        else if(nilaiAkhir>60)
            angka = 'C';
        else if(nilaiAkhir>50)
            angka = 'D';
        else
            angka = 'E';
    }
    @Override
    public void isiData(){
        System.out.println("Nilai UTS : "+uts);
        System.out.println("Nilai UAS : "+uas);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        System.out.println("Angka Mutu : "+angka);
    }
}