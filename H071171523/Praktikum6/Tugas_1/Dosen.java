
package Tugas_1;

class Dosen extends Pegawai{
    private int sks;
    public Dosen(String name, int sks){
        super(name);
        setSks(sks);
    }
    public void setSks(int sks) {
        this.sks = sks;
    }
    public int getSks() {
        return sks;
    }
    @Override
    public int getGaji(){
        return gaji+(sks*120000);
    }
}

// Yang Mana mau nutanyakan ?
//tugas 3 iyya yang mau kutanya :v
// Kenapai ?
// itu to, kelas nya dibuat 3 ki? yg 
// class utama yg user yg class sistem informasi trs yg subclass nya itu dosen sama mahasiswa??
// Begini STrukturnya
// class SistemInformasiAkademi;
// class User
// class Mahasiswa extends User
// class Dosen extends User
// class Matakuliah
// begitu kasarnya
// berarti itu semua class nya di implements dengan kelas SistemInformasiAkademik? Tidak
// Tidak ada yg implements disitu, kan class semua, bukan interface
// kalau mau implement, ubah class User jadi interface, nanti class Dosen dan Mahaiswa
// implements User
// terus haruskah mmg pake serializable atau tergantung input outpunya? nda harusji
// oh okok. bisajikah ku kumpul yang tugas 3 kek lewat hari jumat?? atau kukumpul dulu yg tugas 1 2
// terus tgs 3 nyusul?? bisajikah?? :v
// yuhu?? :v
// Kerjami saja semampumu, yang tugas 3 kalo moko ikuti yg di modul jg nda mslah
// oh oke mi. ku coba" mi kerja yg no 3.
// ituji yg mauku tanyakan. 
// OK, install ko jg Live Share Chat supaya gampang tanyatanya
// itu yg mu kirim linknya? yg ada 3 link? Bukan, cari mako saja Live SHare Chat
//ohh okok sip. thank you nah
//  sipp
// jadi ku end mi ini? iya
//ok