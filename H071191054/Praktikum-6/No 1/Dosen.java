public class Dosen extends Pegawai {
    int bonus = 120000;
    int sks;

    public Dosen(String name, int sks) {
        super(name);
        this.sks = sks;
    }

    public void totalSalary(String name, int sks) {
        int total = firstSalary + (sks * bonus);
        System.out.println(name + " mendapatkan gaji Rp. " + total);
    }

}